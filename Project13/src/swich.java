import java.util.Scanner;
public class swich {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("����� �Է��ϼ��� : ");
		int rank = in.nextInt();
		
		switch (rank) {
		case 1:
			System.out.println("1���Դϴ�");
			break;
		case 2:
			System.out.println("2���Դϴ�");
			break;
		case 3:
			System.out.println("3���Դϴ�");
			break;
		default:
			System.out.println("����Դϴ�");
		}
	}

}
