import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(5000);
				Socket connection = server.accept();  // 클라이언트가 연결을 요철할 때까지 기다린다. 연결을 요청하면 승인하고, 서버용 소켓 생성
				InputStream is = connection.getInputStream();
				ObjectInputStream ois = new ObjectInputStream(is);) {
			String str = (String) ois.readObject();
			System.out.println("받은 문자열 = " + str);
		} catch (Exception e) {
			
		}
	}
}