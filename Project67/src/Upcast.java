public class Upcast {
	public static void main(String[] args) {
		Person p;
		Student s = new Student();
		
		p = s;      // 자동으로 타입 변환되며  p = (Person)s와 동일.
		p.whoami(); // Person 타입 멤버이므로 호출할 수 있다.
		
		// p.number = 1;
		// p.work();     --number와 work()는 부모타입에 없는 멤버이므로 부모타입 변수에서 볼 수 없다.
	}

}
