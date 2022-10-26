import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) throws IOException {
		ServerSocket server = null;
		Socket connection = null;
		BufferedReader in = null;
		try {
			server = new ServerSocket(5000);   // 서버 소켓을 5000번 포트로 생성
		} catch (IOException e) {
			
		}
		System.out.println("연결 대기 중...");
		try {
			connection = server.accept();     // 클라이언트에서 연결을 요청하면 승인하고 소켓 생성
		} catch (IOException e) {
			
		}
		System.out.println("메세지를 기다리는 중...");
		in = new BufferedReader(
				new InputStreamReader(connection.getInputStream()));  // 소켓에서 입력 스트림을 가져와 InputStreamReader 객체 생성
		String msg;
		while ((msg = in.readLine()) != null) {
			System.out.println("읽은 메세지 : " + msg);
		}
		System.out.println("서버 종료");
		in.close();
		connection.close();
		server.close();
	}
}