import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class Stream1Demo {
	public static void main(String[] args) {
		File file = new File("C:\\Windows");
		File[] fs = file.listFiles();
		Stream<File> stream = Arrays.stream(fs);
		long count = stream.filter(x -> x.isDirectory() == false).count();
		System.out.println("C:\\Windows�� �ִ� ���� ���� : " + count);
	}
}