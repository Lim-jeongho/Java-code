import java.util.Scanner;

public class WhileDemo {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Էµ� ���� ��� ���ϱ� \n0�Է½� ����");
		int n = scanner.nextInt();
		while (n != 0) {
			sum += n;
			count++;
			n = scanner.nextInt();
		}
		if (count == 0)
			System.out.println("�Էµ� ���� �����ϴ�");
		else {
			System.out.print("������ ������ " + count + "���̸� ");
			System.out.println("����� " + (double)sum/count + "�Դϴ�.");
		}
		scanner.close();
	}
}