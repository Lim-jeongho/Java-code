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
			server = new ServerSocket(5000);   // ���� ������ 5000�� ��Ʈ�� ����
		} catch (IOException e) {
			
		}
		System.out.println("���� ��� ��...");
		try {
			connection = server.accept();     // Ŭ���̾�Ʈ���� ������ ��û�ϸ� �����ϰ� ���� ����
		} catch (IOException e) {
			
		}
		System.out.println("�޼����� ��ٸ��� ��...");
		in = new BufferedReader(
				new InputStreamReader(connection.getInputStream()));  // ���Ͽ��� �Է� ��Ʈ���� ������ InputStreamReader ��ü ����
		String msg;
		while ((msg = in.readLine()) != null) {
			System.out.println("���� �޼��� : " + msg);
		}
		System.out.println("���� ����");
		in.close();
		connection.close();
		server.close();
	}
}