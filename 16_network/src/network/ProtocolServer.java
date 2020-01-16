package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ProtocolServer {
	private ServerSocket serverSocket;
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	public ProtocolServer() {
		try {
			serverSocket = new ServerSocket(9500);
			System.out.println("서버준비완료...");
			socket = serverSocket.accept();//클라이언트 쪽에 들어온걸 낚아챈다.
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
		} catch (IOException e) {
			System.out.println("클라이언트와 연결이 안되었습니다.");
			e.printStackTrace();
			System.exit(0);
		}
		String line;
		while(true) {
			try {
				//받는쪽
				line = br.readLine();
				
				//보내는쪽
				String[] ar = line.split(":");
				if(ar[0].equals(Protocol.ENTER)) {
					bw.write(ar[1]+"님 입장\n");
					bw.flush();
				}else if(ar[0].equals(Protocol.EXIT)) {
					//엔젤님 퇴장
					//연결끊기
					bw.write(ar[1]+"님 퇴장\n");
					bw.flush();
					br.close();
					bw.close();
					socket.close();
					System.exit(0);
					
				}else if(ar[0].equals(Protocol.SEND_MESSAGE)) {
					bw.write("["+ar[1]+"] "+ar[2]+"\n");
					bw.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}//const
	public static void main(String[] args) {
		new ProtocolServer();
	}
}
