
public class Operator {

	public static void main(String[] args) {
		int x = 1, y = 2;
		System.out.println(x++);
		System.out.println(x++ + y--);
		System.out.printf("x=%d,y=%d\n", x, y);
		System.out.println(x++ / 3 + x * ++y);
		System.out.printf("x=%d,y=%d\n", x, y);
	}

}
