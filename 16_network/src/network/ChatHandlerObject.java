package network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;

public class ChatHandlerObject extends Thread{
	private Socket socket;
	private List<ChatHandlerObject> list;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	private InfoDTO dto;
	private String nickName;
	
	public ChatHandlerObject(Socket socket, List<ChatHandlerObject> list) {
		this.socket = socket;
		this.list = list;
		dto = new InfoDTO();
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
				dto = (InfoDTO)ois.readObject();
				System.out.println("handler run: "+dto.getCode());
				nickName = dto.getNickName();
			//�г��� �޴� ��
//			String nickName = br.readLine();
//			broadcast(nickName + "���� �����ϼ̽��ϴ�.");
//			String line;
			broadcast(dto);
			while(true) {
				System.out.println("hadler while");
				dto = (InfoDTO)ois.readObject();
				//�޴� ��
				//line = br.readLine();
				if(dto.getCode().equals("300")){
					System.out.println("300"+dto.getMsg());
					dto.setCode("300");
					broadcast(dto);
				}
				else if(dto == null || dto.getMsg().toLowerCase().equals("quit") || dto.getCode().equals("200")) {
					System.out.println("dto null");
					if(dto.getNickName()==nickName){
						oos.close();
						ois.close();
						socket.close();
						break;
					}
				}else 
				//������ ��
				broadcast(dto);
				
				
			}//while
			System.out.println("�ڵ鷯 while�� Ż��");
			//Ŭ���̾�Ʈ�κ��� quit�� �޾�����
			dto.setCode("200");
			broadcast(dto);
//			pw.println("quit");
//			pw.flush();
			
			//���� Ŭ���̾�Ʈ���� ���� �޼��� ������
			list.remove(this);
//			broadcast(nickName+"���� �����ϼ̽��ϴ�.");
//			
//			pw.close();
//			br.close();
//			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
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