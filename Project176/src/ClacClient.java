import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClacClient {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			socket = new Socket("localhost", 9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				System.out.print("계산식(빈칸으로 띄어 입력, 예) 25 + 31) >> ");
				String outputMessage = scanner.nextLine();
				if (outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage+"\n");
					System.out.println("서버종료");
					out.flush();
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.println("계산 결과 : " + inputMessage);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				if(socket != null) socket.close();
			} catch (IOException e) {
				System.out.println("서버와 채팅중 오류가 발생 했습니다.");
			}
		}
	}
}