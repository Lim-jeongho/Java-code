public class WhichThreadTest implements Runnable {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> System.out.println("æ»≥Á"));
		thread.start();
	}
	
	public void run() {
		System.out.println("æ»≥Á«œººø‰");
	}
}