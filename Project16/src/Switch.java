import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = in.nextInt();
		
		switch (num) {
		case 9:
			System.out.println("*********");
		case 8:
			System.out.println("********");
		case 7:
			System.out.println("*******");
		case 6:
			System.out.println("******");
		case 5:
			System.out.println("*****");
		case 4:
			System.out.println("****");
		case 3:
			System.out.println("***");
		case 2:
			System.out.println("**");
		case 1:
			System.out.println("*");
		case 0:
			System.out.println("0");
		}

	}

}
