public class Anonymous2 {
	public static void main(String[] args) {
		Bird b = new Bird() {
			public void move() {
				System.out.println("�������� ����~~");
			}
		};
		b.move();
	}
}
