import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int number = in.nextInt();
		
		if(number % 2 == 0)
			System.out.println("¦��");
		else
			System.out.println("Ȧ��");
		System.out.println("����");
	}

}
