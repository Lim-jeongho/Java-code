interface Portable{
	void inMyBag();
}
public class Notebook extends Computer implements Portable {
	public void inMybag() {
		System.out.println("��Ʈ���� ���濡 �ִ�.");
	}
	public void turnOn() {
		System.out.println("��Ʈ���� �Ҵ�.");
	}
	public void turnOff() {
		System.out.println("��Ʈ���� ����.");
	}
	public static void main(String[] args) {
		Notebook n = new Notebook();
		n.turnOn();
		n.turnOff();
		n.inMybag();
	}
}