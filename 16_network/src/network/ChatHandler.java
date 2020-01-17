package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;

//thread�� ������ Socket ����,����
//�ڱⰡ �����ϴ°� �ƴ϶� ������ �����ִ°� �����ϴ°Ŷ� main����
public class ChatHandler extends Thread {
	private Socket socket;
	private List<ChatHandler> list;
	private BufferedReader br;
	private PrintWriter pw;
	
	public ChatHandler(Socket socket, List<ChatHandler> list) {
		System.out.println("�ڵ鷯");
		this.socket = socket;
		this.list = list;
		//IO����(Exception��������)
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (UnknownHostException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			System.out.println("������ ������ �ȵǾ����ϴ�.");
			e.printStackTrace();
			System.exit(0);
		}
	}

	@Override
	public void run() {
		//�����κ��� �޴� ��
		try {
			//�г��� �޴� ��
			String nickName = br.readLine();
			broadcast(nickName + "���� �����ϼ̽��ϴ�.");
			String line;
			while(true) {
				//�޴� ��
				line = br.readLine();
				if(line==null || line.toLowerCase().equals("quit")) {
					break;
				}
				//������ ��
				broadcast("["+nickName+"] "+line);
				
			}//while
			
			//Ŭ���̾�Ʈ�κ��� quit�� �޾�����
			pw.println("quit");
			pw.flush();
			
			//���� Ŭ���̾�Ʈ���� ���� �޼��� ������
			list.remove(this);
			broadcast(nickName+"���� �����ϼ̽��ϴ�.");
			
			pw.close();
			br.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//run

	private void broadcast(String msg) {
		//��ü Ŭ���̾�Ʈ���� ������
		for(ChatHandler handler : list) {
			handler.pw.println(msg);
			handler.pw.flush();
		}
		
	}
}
