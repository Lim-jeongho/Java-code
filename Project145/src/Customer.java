public class Customer implements Runnable {
	private final Dish dish;
	public Customer(Dish dish) {
		this.dish = dish;
	}
	
	private void eat(int i) throws InterruptedException {
		synchronized (dish) {
			while (dish.isEmpty())
				dish.wait();
			dish.setEmpty(true);
			System.out.println(i + "��° ������ �Ծ����ϴ�.");
			dish.notify();
		}
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				eat(i);
				Thread.sleep(50);
			} catch (InterruptedException ex) {
			}
		}
	}
}