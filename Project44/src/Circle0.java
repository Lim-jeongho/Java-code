class Circle {
	double radius;
	static int numOfCircles = 0;   // 정적변수
	int numCircles = 0;
	
	public Circle(double radius) {
		this.radius = radius;
		numOfCircles++;   // 객체를 생성할 때마다 하나씩 증가
		numCircles++;     // 객체마다 별도의 기억공간을 사용하기 떄문에 항상 0에서 증가
	}
}
public class Circle0 {
	public static void main(String[] args) {
		Circle myCircle = new Circle(10.0);
		Circle yourCircle = new Circle(5.0);
		
		System.out.println("원의 개수 : " + Circle.numOfCircles);
		System.out.println("원의 개수 : " + yourCircle.numCircles);
	}
	
	void print() {
		System.out.println("인스턴스 메서드 입니다.");
	}
} 
