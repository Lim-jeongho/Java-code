import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TestClient {
	public static void main(String[] args) {
		try (Socket client = new Socket("localhost", 5000);
				OutputStream os = client.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);){
			oos.writeObject("���� �׽�Ʈ");
		} catch (Exception e) {
			
		}
	}
}