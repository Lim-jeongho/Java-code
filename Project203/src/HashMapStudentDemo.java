import java.util.HashMap;
import java.util.Scanner;

class Student {
	private int id;
	private String tel;
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
}

public class HashMapStudentDemo {
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put("�躴��", new Student(1, "010-1111-1111"));
		map.put("�̾Ƹ�", new Student(2, "010-2222-2222"));
		map.put("���м�", new Student(3, "010-3333-3333"));
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("�˻��� �̸� : ");
			String name = scanner.nextLine();
			if(name.equals("exit")) {
				System.out.println("�����մϴ�..");
				break;
			}
			Student student = map.get(name);
			if(student == null)
				System.out.println(name + "��(��) ���� ����Դϴ�.");
			else
				System.out.println("id : " + student.getId() + ", ��ȭ : " + student.getTel());
		}
		scanner.close();
	}
}