public class MemberClassDemo {
	private String secret = "비공개";
	String s = "외부";
	
	class MemberClass {
		String s = "내부";
		public void show1() {
			System.out.println("인스턴스 멤버 클래스");
			System.out.println(secret);
			System.out.println(s);   // 6행의 멤버 s
			System.out.println(MemberClassDemo.this.s);  // 3행의 멤버 s
		}
	}
	public static void main(String[] args) {
		MemberClassDemo m = new MemberClassDemo();
		MemberClassDemo.MemberClass m1 = m.new MemberClass();
		
		System.out.println(m1.s);
		m1.show1();
	}
}
