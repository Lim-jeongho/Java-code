public class Ball extends Circle{
	private String color;
	public Ball(String color) {
		this.color = color;
	}
	public void findColor() {
		System.out.println(color + " 공이다.");
	}
	public void findArea() {
		System.out.println("넓이는 4*(π*반지름*반지름)이다.");
	}
	public void findVolume() {
		System.out.println("부피는 4/3*(π*반지름*반지름*반지름)이다.");
	}
}
