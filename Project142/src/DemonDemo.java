public class DemonDemo {
	public static void main(String[] args) {
		Runnable task = ( ) -> {
			for (int i = 0; i < 3; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName());
		}
	};
	Thread t1 = new Thread(task, "작업 스레드");
	// t1.setDaemon(true) -- 데몬스레드로 설정
	t1.start();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		} 
	System.out.println("메인 스레드가 끝났습니다.");
	}
}