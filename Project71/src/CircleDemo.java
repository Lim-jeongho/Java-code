class Circle implements Comparable {
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public int compareTo(Object o) {
		Circle c = (Circle) o;
		if (this.radius > c.radius)
			return 1;
		else if (this.radius == c.radius)
			return 0;
		else
			return -1;
	}
}
public class CircleDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle(5.0);
		Circle c2 = new Circle(6.0);
		
		if (c1.compareTo(c2) > 0)
			System.out.println("ù ���� ���� �� ���� ������ ũ��.");
		else if (c1.compareTo(c2) == 0)
			System.out.println("�� ���� ũ�Ⱑ ����.");
		else
			System.out.println("ù ��° ���� �� ���� ������ �۴�.");
	}

}
