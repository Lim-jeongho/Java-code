public class Anonymous1 {
	Bird e = new Bird() {
		public void move() {
			System.out.println("�������� ����~~");
		}
		
		void sound() {
			System.out.println("����~~");
		}
	};
	
	public static void main(String[] args) {
		Anonymous1 a = new Anonymous1();
		a.e.move();  // ���������� �������̵��� �޼��带 ȣ���Ѵ�.
		// a.e.sound();  -- a.e��ü�� Bird Ÿ���̹Ƿ� sound()�޼��带 ȣ���� �� ����.
	}
}
