abstract class Shape {
	double pi = 3.14;  // 추상 클래스도 멤버 필드를 포함할 수 있다.
	abstract void draw();  // 추상 메서드는 본체가 없다.
	public double findArea() {  
		return 0.0;  // 추상 클래스도 구현 메서드를 포함할 수 있다.
	}
}
