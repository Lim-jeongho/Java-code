import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���");
		int sum = 0;
		int n = 0;
		for(int i=1; i<4; i++) {
			System.out.print(i+"��° ���� >> ");
			try {
				n = scanner.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				scanner.nextLine();
				i--;
				continue;
			}
			sum += n;
		}
		System.out.print("���� " + sum);
		scanner.close();
	}
}