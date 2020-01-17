package network;

import java.util.List;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
	private ServerSocket serverSocket;
	private List<ChatHandler> list;
	public ChatServer() {
		try {
			serverSocket = new ServerSocket(9500);
			System.out.println("서버준비완료..");
			
			list = new ArrayList<ChatHandler>();
			while(true) {
				Socket socket = serverSocket.accept();//낚아챈다.
				ChatHandler handler = new ChatHandler(socket, list);//스레드 생성
				handler.start();
				list.add(handler);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}//const
	public static void main(String[] args) {
		new ChatServer();
	}
}
