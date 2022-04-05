import java.util.Scanner;
public class swich {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("등수를 입력하세요 : ");
		int rank = in.nextInt();
		
		switch (rank) {
		case 1:
			System.out.println("1등입니다");
			break;
		case 2:
			System.out.println("2등입니다");
			break;
		case 3:
			System.out.println("3등입니다");
			break;
                case 4:
                        Syayem.out.println("4등입니다");
                        break;
  		default:
			System.out.println("등외입니다");
		}
	}

}
