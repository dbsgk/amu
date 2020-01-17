package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;

//thread로 서버쪽 Socket 관리,지원
//자기가 실행하는게 아니라 서버가 던져주는거 실행하는거라서 main없음
public class ChatHandler extends Thread {
	private Socket socket;
	private List<ChatHandler> list;
	private BufferedReader br;
	private PrintWriter pw;
	
	public ChatHandler(Socket socket, List<ChatHandler> list) {
		System.out.println("핸들러");
		this.socket = socket;
		this.list = list;
		//IO연결(Exception잡아줘야함)
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
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
			//닉네임 받는 쪽
			String nickName = br.readLine();
			broadcast(nickName + "님이 입장하셨습니다.");
			String line;
			while(true) {
				//받는 쪽
				line = br.readLine();
				if(line==null || line.toLowerCase().equals("quit")) {
					break;
				}
				//보내는 쪽
				broadcast("["+nickName+"] "+line);
				
			}//while
			
			//클라이언트로부터 quit를 받았을때
			pw.println("quit");
			pw.flush();
			
			//남은 클라이언트에게 퇴장 메세지 보내기
			list.remove(this);
			broadcast(nickName+"님이 퇴장하셨습니다.");
			
			pw.close();
			br.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//run

	private void broadcast(String msg) {
		//전체 클라이언트에게 보내기
		for(ChatHandler handler : list) {
			handler.pw.println(msg);
			handler.pw.flush();
		}
		
	}
}
