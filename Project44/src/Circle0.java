class Circle {
	double radius;
	static int numOfCircles = 0;   // ��������
	int numCircles = 0;
	
	public Circle(double radius) {
		this.radius = radius;
		numOfCircles++;   // ��ü�� ������ ������ �ϳ��� ����
		numCircles++;     // ��ü���� ������ �������� ����ϱ� ������ �׻� 0���� ����
	}
}
public class Circle0 {
	public static void main(String[] args) {
		Circle myCircle = new Circle(10.0);
		Circle yourCircle = new Circle(5.0);
		
		System.out.println("���� ���� : " + Circle.numOfCircles);
		System.out.println("���� ���� : " + yourCircle.numCircles);
	}
	
	void print() {
		System.out.println("�ν��Ͻ� �޼��� �Դϴ�.");
	}
} 
