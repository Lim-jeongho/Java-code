interface Portable{
	void inMyBag();
}
public class Notebook extends Computer implements Portable {
	public void inMybag() {
		System.out.println("≥Î∆Æ∫œ¿∫ ∞°πÊø° ¿÷¥Ÿ.");
	}
	public void turnOn() {
		System.out.println("≥Î∆Æ∫œ¿ª ƒ“¥Ÿ.");
	}
	public void turnOff() {
		System.out.println("≥Î∆Æ∫œ¿ª ≤ˆ¥Ÿ.");
	}
	public static void main(String[] args) {
		Notebook n = new Notebook();
		n.turnOn();
		n.turnOff();
		n.inMybag();
	}
}