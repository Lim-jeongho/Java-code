public class Upcast {
	public static void main(String[] args) {
		Person p;
		Student s = new Student();
		
		p = s;      // �ڵ����� Ÿ�� ��ȯ�Ǹ�  p = (Person)s�� ����.
		p.whoami(); // Person Ÿ�� ����̹Ƿ� ȣ���� �� �ִ�.
		
		// p.number = 1;
		// p.work();     --number�� work()�� �θ�Ÿ�Կ� ���� ����̹Ƿ� �θ�Ÿ�� �������� �� �� ����.
	}

}
