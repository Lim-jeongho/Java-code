class Rectangle extends Shape {
	int a, b;
public Rectangle(int a, int b) {
	this.a = a;
	this.b = b;
}
public void draw() {
	System.out.println("사각형을 그리다.");
}
public double findArea() {
	return a * b;
	}
}
