package sec06;

public class One1 extends One {
	void print() {
		System.out.println(roommate);
		System.out.println(child);
		System.out.println(anybody);
		// system.out.println(secret); --같은 패키지에 있는 자식 객체라도 부모 클래스의 private 멤버에는 접근할 수 없다.
	}
}
