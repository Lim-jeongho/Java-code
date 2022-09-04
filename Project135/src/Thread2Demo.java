public class Thread2Demo {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.print("Àß°¡. ");
					try {
						Thread.sleep(500);;
					} catch (InterruptedException e) {
					}
				}
			}
		} ).start();
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.print("¾È³ç. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}