import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressDemo {
	public static void main(String[] args) {
		InetAddress addr1 = null, addr2 = null;
		System.out.println("ȣ��Ʈ �̸��� �Է��Ͻÿ� : ");
		Scanner in = new Scanner(System.in);
				String url = in.nextLine();
				
				try {
					addr1 = InetAddress.getByName(url);
					addr2 = InetAddress.getLocalHost();
				} catch (UnknownHostException e) {
					
				}
				System.out.print(url + "�� IP �ּ� : ");
				System.out.println(addr1.getHostAddress());
				System.out.print("���� IP �ּ� : ");
				System.out.println(addr2.getHostAddress());
	}
}