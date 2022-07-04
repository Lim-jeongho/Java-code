public class Anonymous1 {
	Bird e = new Bird() {
		public void move() {
			System.out.println("독수리가 난다~~");
		}
		
		void sound() {
			System.out.println("휘익~~");
		}
	};
	
	public static void main(String[] args) {
		Anonymous1 a = new Anonymous1();
		a.e.move();  // 다형성으로 오버라이딩한 메서드를 호출한다.
		// a.e.sound();  -- a.e객체가 Bird 타입이므로 sound()메서드를 호출할 수 없다.
	}
}
