package network_t;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

public class ChatHandlerObject extends Thread {
	private Socket socket;
	private List<ChatHandlerObject> list;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	public ChatHandlerObject(Socket socket, List<ChatHandlerObject> list) throws IOException {
		this.socket = socket;
		this.list = list;
		
		ois = new ObjectInputStream(socket.getInputStream());
		oos = new ObjectOutputStream(socket.getOutputStream());
	}
	@Override
	public void run() {
		
		try {
			InfoDTO dto = null;
			String nickName = null;

			while(true){ 
				//�޴� ��
				dto = (InfoDTO)ois.readObject();
				
				if(dto.getCommand()==Info.JOIN) {
					nickName = dto.getNickName();
					
					//��� Ŭ���̾�Ʈ���� �޼��� ������
					InfoDTO sendDTO = new InfoDTO();
					sendDTO.setCommand(Info.SEND);
					sendDTO.setMsg(nickName + "���� �����ϼ̽��ϴ�.");
					broadcast(sendDTO);

				}else if (dto.getCommand() == Info.SEND) {
					InfoDTO sendDTO = new InfoDTO();
					sendDTO.setCommand(Info.SEND);
					sendDTO.setMsg("[" + nickName + "]" + dto.getMsg());
					broadcast(sendDTO);
					
				} else if (dto.getCommand() == Info.EXIT) {
					//���� ������ Ŭ���̾�Ʈ���� ����޼��� ������
					list.remove(this);
					
					InfoDTO sendDTO = new InfoDTO();
					sendDTO.setCommand(Info.SEND);
					sendDTO.setMsg(nickName + "���� �����ϼ̽��ϴ�.");
					broadcast(sendDTO);
					
					//�����״� exit�� ������
					sendDTO.setCommand(Info.EXIT);
					oos.writeObject(sendDTO);
					oos.flush();
					
					ois.close();
					oos.close();
					socket.close();
					break;
				}
			}//while
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	private void broadcast(InfoDTO sendDTO) {
		for(ChatHandlerObject dto : list) {
			try {
				dto.oos.writeObject(sendDTO);
				dto.oos.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}//broadcast
}
