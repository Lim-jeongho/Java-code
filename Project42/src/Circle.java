class Circle{
	double radius;
	String color;
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public Circle(double radius) {
		this(radius, "�Ķ�");  // �Ű������� �ִ� ���� �����ڸ� ȣ���Ѵ�.
	}
	
	public Circle(String color) {
		this(10.0, color);
	}
	
	public Circle() {
		this(10.0, "����");
	}
}

