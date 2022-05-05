class Circle {
	double radius;
	String color;
	
	public Circle(double r, String c) {
		radius = r;
		color = c;
	} // 임의의 반지름과 색상을 가진 생성자1
	
	public Circle(double r) {
		radius = r;
		color = "파랑";
	} // 임의의 반지름과 파란색상을 가진 생성자2
	
	public Circle(String c) {
		radius = 10.0;
		color = c;
	} // 반지름이 10.0이고 임의의 색상을 가진 생성자3
	
	public Circle() {
		radius = 10.0;
		color = "빨강";
	} // 반지름이 10.0이고 빨강색상을 가진 생성자4
}

public class Circle0 {
	public static void main(String[] args) {
		Circle c1 = new Circle(10.0, "빨강");
		
		Circle c2 = new Circle(5.0);
		
		Circle c3 = new Circle("노랑");
		
		Circle c4 = new Circle();
	}

}
