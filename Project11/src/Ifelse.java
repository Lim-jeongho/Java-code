import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int number = in.nextInt();
		
		if(number % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		System.out.println("종료");
	}

}
