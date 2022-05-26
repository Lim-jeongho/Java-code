class Circle{
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	double findArea() {
		return 3.14 * radius * radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		Circle[] circles = new Circle[5];
		
		for(int i = 0; i < circles.length; i++) {
			circles[i] = new Circle(i + 1.0);
			System.out.printf("���� ����(������ : %.1f) = %.2f\n", circles[i].radius, circles[i].findArea());
		}

	}

}
