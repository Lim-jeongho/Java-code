class Rectangle extends Shape {
	int a, b;
public Rectangle(int a, int b) {
	this.a = a;
	this.b = b;
}
public void draw() {
	System.out.println("�簢���� �׸���.");
}
public double findArea() {
	return a * b;
	}
}
