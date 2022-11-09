import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum = 0;
		int n = 0;
		for(int i=1; i<4; i++) {
			System.out.print(i+"번째 정수 >> ");
			try {
				n = scanner.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				scanner.nextLine();
				i--;
				continue;
			}
			sum += n;
		}
		System.out.print("합은 " + sum);
		scanner.close();
	}
}