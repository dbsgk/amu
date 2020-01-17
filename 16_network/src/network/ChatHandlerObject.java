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
		//IO연결(Exception잡아줘야함)
		try {
			oos = new ObjectOutputStream(socket.getOutputStream());
			oos.flush();
			ois = new ObjectInputStream(socket.getInputStream());
		} catch (UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다.");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			System.out.println("서버와 연결이 안되었습니다.");
			e.printStackTrace();
			System.exit(0);
		}
	}

	@Override
	public void run() {
		//서버로부터 받는 쪽
		try {
			try {
				dto = (InfoDTO)ois.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			//닉네임 받는 쪽
			
//			String nickName = br.readLine();
//			broadcast(nickName + "님이 입장하셨습니다.");
//			String line;
			while(true) {
				
				//받는 쪽
				//line = br.readLine();
//				if(dto == null || dto.getMsg().toLowerCase().equals("quit")) {
//					break;
//				}
				//보내는 쪽
				broadcast(dto);
				
			}//while
			
			//클라이언트로부터 quit를 받았을때
			
//			pw.println("quit");
//			pw.flush();
			
			//남은 클라이언트에게 퇴장 메세지 보내기
//			list.remove(this);
//			broadcast(nickName+"님이 퇴장하셨습니다.");
//			
//			pw.close();
//			br.close();
//			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//run

	private void broadcast(InfoDTO dto) {
		//클라이언트에게 보내기
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
