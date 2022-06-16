class Vehicle {
	String name = "탈 것";
	void whoami() {
		System.out.println("나는 탈 것이다.");
		}
	static void move() {
		System.out.println("이동하다.");
	}
}
class Car extends Vehicle {
	String name = "자동차";
	void whoami() {
		System.out.println("나는 자동차이다.");
	}
	static void move() {
		System.out.println("달리다.");
	}
}
public class OverType {
	public static void main(String[] args) {
		Vehicle v = new Car();
		System.out.println(v.name);  // Vehicle타입의 name필드에 접근한다.
		v.whoami();
		v.move();
	}
}
