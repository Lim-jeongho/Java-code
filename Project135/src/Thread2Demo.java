public class Thread2Demo {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.print("�߰�. ");
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
			System.out.print("�ȳ�. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}