import java.util.Scanner;

class Rectangle {
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
}

public class RectDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		System.out.print("�ʺ� : ");
		rect.width = scanner.nextInt();
		System.out.print("���� : ");
		rect.height = scanner.nextInt();
		System.out.println("�簢���� ���� : " + rect.getArea());
		scanner.close();
	}
}