import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\Temp\\org.txt"));) {
			br.lines().forEach(s -> System.out.println(s));
		} catch (IOException e) {
		}
	}
}