public class WhichThreadTest implements Runnable {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> System.out.println("�ȳ�"));
		thread.start();
	}
	
	public void run() {
		System.out.println("�ȳ��ϼ���");
	}
}