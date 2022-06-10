package sec06;

public class Two {
	void print() {
		One o = new One();
		System.out.println(o.roommate);
		System.out.println(o.child);
		System.out.println(o.anybody);
		// System.out.println(o.secret); --같은 패키지에 있더라도 다른 객체의 private 멤버에 접근할 수 없다.
	}
}
