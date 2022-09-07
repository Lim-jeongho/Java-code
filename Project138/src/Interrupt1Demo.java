public class Interrupt1Demo {
	public static void main(String[] args) {
		Runnable task = () -> {
			try {
				while (true) {
					System.out.println("���� ��...");
					Thread.sleep(1);
				}
			} catch (InterruptedException e) {
				
			}
			System.out.println("����");
		};
		
		Thread t = new Thread(task);
		t.start();
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			
		}
		t.interrupt();
	}
}