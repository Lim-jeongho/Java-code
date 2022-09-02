import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Stream2Demo {
	public static void main(String[] args) throws Exception {
		String[] number = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		Path p = new File("D:\\Temp\\number.txt").toPath();  // 파일에서 Path 객체를 생성
		Stream<String> s = Files.lines(p);                   // Path 객체로 스트림을 생성
		s.forEach(x -> System.out.println(x));               // 스트림 원소를 출력
		s = Files.lines(p);                                  // 다시 스트림 생성
		s.map(x -> number[Integer.parseInt(x)]).forEach(x -> System.out.print(x + " "));  // 스트림 원소 값에 대응하는 number 배열 값 출력
	}
}