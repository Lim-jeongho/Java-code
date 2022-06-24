public interface Controllable {
	default void repair() {
		System.out.println("장비를 수리한다.");  // 디폴트 메서드
	}
	static void reset() {
		System.out.println("장비를 초기화한다.");  // 정적 메서드
	}
	void turnOn();
	void turnOff();  // 추상 메서드
}
