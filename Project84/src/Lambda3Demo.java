interface Printable {
	void print();
}

public class Lambda3Demo {
	public static void main(String[] args) {
		Printable p;
		p = () -> {
			System.out.println("�ȳ�!");
		};
		p = () -> System.out.println("�ȳ�!");
		p.print();
	}
}
