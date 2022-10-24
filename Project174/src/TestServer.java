import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(5000);
				Socket connection = server.accept();  // Ŭ���̾�Ʈ�� ������ ��ö�� ������ ��ٸ���. ������ ��û�ϸ� �����ϰ�, ������ ���� ����
				InputStream is = connection.getInputStream();
				ObjectInputStream ois = new ObjectInputStream(is);) {
			String str = (String) ois.readObject();
			System.out.println("���� ���ڿ� = " + str);
		} catch (Exception e) {
			
		}
	}
}