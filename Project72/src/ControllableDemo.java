public class ControllableDemo {
	public static void main(String[] args) {
		TV tv = new TV();
		Computer com = new Computer();
		tv.turnOn();
		tv.turnOff();
		tv.repair();
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable.reset();
	}
}
