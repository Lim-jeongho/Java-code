public class Abstract {
	public static void main(String[] args) {
		Circle c = new Circle(3);
		c.draw();
		System.out.printf("���� ���̴� %.1f\n", c.findArea());
		
		Rectangle r = new Rectangle(3, 4);
		r.draw();
		System.out.printf("�簢���� ���̴� %.1f\n" , r.findArea());
	}

}
