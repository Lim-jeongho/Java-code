interface Negative {
	int neg(int x);
}
public class Lambda2Demo {
	public static void main(String[] args) {
		Negative n;
		n = (int x) -> {
			return -x;
		};
		n = (x) -> {
			return -x;
		};
		n = (int x) -> -x;
		n = (x) -> -x;
		n = x -> -x; 
	}
}
