import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = in.nextInt();
		
		switch (num) {
		case 9:
			System.out.println("9");
		case 8:
			System.out.println("8");
		case 7:
			System.out.println("7");
		case 6:
			System.out.println("6");
		case 5:
			System.out.println("5");
		case 4:
			System.out.println("4");
		case 3:
			System.out.println("3");
		case 2:
			System.out.println("2");
		case 1:
			System.out.println("1");
		case 0:
			System.out.println("0");
		}

	}

}
