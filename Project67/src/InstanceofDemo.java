public class InstanceofDemo {
	public static void main(String[] args) {
		Student s = new Student();
		Person p = new Person();
		
		System.out.println(s instanceof Person);
		System.out.println(s instanceof Student);
		System.out.println(p instanceof Student);
		// System.out.println(s instanceof String); -- s�� String Ÿ�԰� ��������Ƿ� ���� �߻�.
		downcast(s);
	}
	static void downcast(Person p) {
		if(p instanceof Student) {
			Student s = (Student) p;
			System.out.println("���� Ÿ�� ��ȯ");
		}
	}
}
