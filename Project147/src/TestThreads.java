class MyThread extends Thread {
	MyThread() {
		System.out.print("MyThread-");
	}
	
	public void run() {
		System.out.print("run1-");
	}
	
	public void run(String s) {
		System.out.print("run2-");
	}
}

public class TestThreads {
	public static void main(String[] args) {
		Thread t = new MyThread() {
			public void run() {
				System.out.print("run3-");
			}
		};
		t.start();
	}
}