import java.util.Scanner;

public class WhileDemo {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력된 숫자 평균 구하기 \n0입력시 종료");
		int n = scanner.nextInt();
		while (n != 0) {
			sum += n;
			count++;
			n = scanner.nextInt();
		}
		if (count == 0)
			System.out.println("입력된 수가 없습니다");
		else {
			System.out.print("정수의 개수는 " + count + "개이며 ");
			System.out.println("평균은 " + (double)sum/count + "입니다.");
		}
		scanner.close();
	}
}