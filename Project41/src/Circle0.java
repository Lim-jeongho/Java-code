class Circle {
	double radius;
	String color;
	
	public Circle(double r, String c) {
		radius = r;
		color = c;
	} // ������ �������� ������ ���� ������1
	
	public Circle(double r) {
		radius = r;
		color = "�Ķ�";
	} // ������ �������� �Ķ������� ���� ������2
	
	public Circle(String c) {
		radius = 10.0;
		color = c;
	} // �������� 10.0�̰� ������ ������ ���� ������3
	
	public Circle() {
		radius = 10.0;
		color = "����";
	} // �������� 10.0�̰� ���������� ���� ������4
}

public class Circle0 {
	public static void main(String[] args) {
		Circle c1 = new Circle(10.0, "����");
		
		Circle c2 = new Circle(5.0);
		
		Circle c3 = new Circle("���");
		
		Circle c4 = new Circle();
	}

}
