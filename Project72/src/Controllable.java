public interface Controllable {
	default void repair() {
		System.out.println("��� �����Ѵ�.");  // ����Ʈ �޼���
	}
	static void reset() {
		System.out.println("��� �ʱ�ȭ�Ѵ�.");  // ���� �޼���
	}
	void turnOn();
	void turnOff();  // �߻� �޼���
}
