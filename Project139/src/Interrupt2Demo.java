public class Interrupt2Demo {
	public static void main(String[] args) {
		Runnable task = () -> {
			while (!Thread.currentThread().isInterrupted()) {
				System.out.println("���� ��...");
			}
			System.out.println("����");
		};
		
		Thread t = new Thread(task);
		t.start();
		try {
			Thread.sleep(3);;
		} catch(InterruptedException e) {
			
		}
		t.interrupt();
	}
}