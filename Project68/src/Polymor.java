class SportsCar extends Car {
	void whoami() {
		System.out.println("���� ������ �ڵ����̴�.");
	}
}
public class Polymor {
	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = new Car();
		vehicles[1] = new SportsCar();
		
		for (Vehicle v : vehicles)
			v.whoami();
	}

}