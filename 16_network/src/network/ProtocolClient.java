package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ProtocolClient {
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	private BufferedReader keyboard;
	
	
	public ProtocolClient() {
		try {
			socket = new Socket("192.168.0.27", 9500);//���� ������, ��Ʈ��ȣ
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			
		} catch (UnknownHostException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			System.out.println("������ ������ �ȵǾ����ϴ�.");
			e.printStackTrace();
			System.exit(0);
		}
		String msg;
		String line;
		while(true) {
			try {
				//������ ������ ��(Ŭ���̾�Ʈ)
				/*
				 * "100:angel" 
				 * "200:angel"
				 * "300:angel:�ȳ�"
				 */
				
				msg = keyboard.readLine();//readLine�� 
				bw.write(msg+"\n");
				bw.flush();//���� ����(���۸� ������ ���� �����Ͱ� ��)
				//�����κ��� �޴� ��(Ŭ���̾�Ʈ)
				/*
				 * angel�� ���� 
				 * angel�� ����
				 * [angel] �ȳ�
				 */
				line = br.readLine();//�亯�ް�
				System.out.println(line);//print�ϰ�
				
				String[] ar = msg.split(":");
				if(ar[0].equals("200")) {//���������� ��� ���� �� �����.
					br.close();
					bw.close();
					socket.close();
					
					keyboard.close();
					System.exit(0);

				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}//while
		
	}
	public static void main(String[] args) {
		new ProtocolClient();
	}
}
