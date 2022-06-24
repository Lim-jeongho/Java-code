public class TV implements Controllable{

	@Override
	public void turnOn() {
		System.out.println("TV¸¦ ÄÒ´Ù.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV¸¦ ²ö´Ù.");
	}
	
}
