interface Printable {
	void print();
}

public class Lambda3Demo {
	public static void main(String[] args) {
		Printable p;
		p = () -> {
			System.out.println("¾È³ç!");
		};
		p = () -> System.out.println("¾È³ç!");
		p.print();
	}
}
