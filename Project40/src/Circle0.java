class Circle {
	private double radius;
	
	public Circle(double r) {
		radius = r;
	} // 기본 생성자 추가
}

public class Circle0 {
	public static void main(String[] args) {
		Circle myCircle = new Circle(10.0);
		// Circle ourCircle = new Circle(10); -- 기본생성자가 없으므로 사용불가
	}

}
