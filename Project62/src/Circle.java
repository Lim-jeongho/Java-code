public class Circle {
	private void secret() {  // 클래스 내부에서만 접근을 허용
		System.out.println("비밀");
	}
	protected void findRadius() {  // 부모와 자식 클래스만 접근을 허용
		System.out.println("반지름이 10.0cm이다.");
	}
	
	public void findArea() {
		System.out.println("넓이는 (π*반지름*반지름) 이다.");
	}
}