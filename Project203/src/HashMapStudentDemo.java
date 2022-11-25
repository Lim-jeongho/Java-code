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
		map.put("김병모", new Student(1, "010-1111-1111"));
		map.put("이아리", new Student(2, "010-2222-2222"));
		map.put("한학수", new Student(3, "010-3333-3333"));
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름 : ");
			String name = scanner.nextLine();
			if(name.equals("exit")) {
				System.out.println("종료합니다..");
				break;
			}
			Student student = map.get(name);
			if(student == null)
				System.out.println(name + "은(는) 없는 사람입니다.");
			else
				System.out.println("id : " + student.getId() + ", 전화 : " + student.getTel());
		}
		scanner.close();
	}
}