class Person{
	String name;
	int age;
	
	public Person setName(String name) {
		this.name = name;
		return this;
	}
	
	public Person setAge(int age) {
		this.age = age;
		return this;
	}
	
	public void sayHello() {
		System.out.println("�ȳ�, ���� " + name + "�̰� " + age + "���̾�.");
	}
}

public class Method {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("��ȣ").setAge(25).sayHello();  // ����ȣ��
	}

}
