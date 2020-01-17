package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;

public class ChatHandlerObject extends Thread{
	private Socket socket;
	private List<ChatHandlerObject> list;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	private InfoDTO dto;
	
	public ChatHandlerObject(Socket socket, List<ChatHandlerObject> list) {
		this.socket = socket;
		this.list = list;
		//IO����(Exception��������)
		try {
			oos = new ObjectOutputStream(socket.getOutputStream());
			oos.flush();
			ois = new ObjectInputStream(socket.getInputStream());
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
			try {
				dto = (InfoDTO)ois.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			//�г��� �޴� ��
			
//			String nickName = br.readLine();
//			broadcast(nickName + "���� �����ϼ̽��ϴ�.");
//			String line;
			while(true) {
				
				//�޴� ��
				//line = br.readLine();
//				if(dto == null || dto.getMsg().toLowerCase().equals("quit")) {
//					break;
//				}
				//������ ��
				broadcast(dto);
				
			}//while
			
			//Ŭ���̾�Ʈ�κ��� quit�� �޾�����
			
//			pw.println("quit");
//			pw.flush();
			
			//���� Ŭ���̾�Ʈ���� ���� �޼��� ������
//			list.remove(this);
//			broadcast(nickName+"���� �����ϼ̽��ϴ�.");
//			
//			pw.close();
//			br.close();
//			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//run

	private void broadcast(InfoDTO dto) {
		//Ŭ���̾�Ʈ���� ������
		for(ChatHandlerObject handler : list) {
			try {
				handler.oos.writeObject(dto);
				handler.oos.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
