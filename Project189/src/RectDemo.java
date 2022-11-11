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
		System.out.print("너비 : ");
		rect.width = scanner.nextInt();
		System.out.print("높이 : ");
		rect.height = scanner.nextInt();
		System.out.println("사각형의 면적 : " + rect.getArea());
		scanner.close();
	}
}