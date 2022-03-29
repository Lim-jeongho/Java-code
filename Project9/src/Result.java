
public class Result {

	public static void main(String[] args) {
		int i1 = 0x10, i2 = 5;
		final int ONE = 1;
		char c1 = 'a';
		float f1 = 1.5f;
		double d1 = 2.8;
		boolean b1 = true;
		
		System.out.printf("i1 = %d\n", i1);
		System.out.printf("i1/4 = %d\n", i1 / 4);
		System.out.println("c1 + ONE = " + c1 + ONE);
		System.out.println("(int)c1 + ONE = " + (int) c1 + ONE);
		System.out.printf("(c1 + ONE) = %d\n", c1 + ONE);
		System.out.printf("(c1 + ONE) = %c\n", c1 + ONE);
		System.out.printf("(c1 + ONE) = %5s\n", c1 + ONE);
		System.out.printf("i2 + f1 = %f\n", i2 + f1);
		System.out.printf("f1 + d1 = %.1f\n", f1 + d1);
		System.out.printf("(int)(f1 + d1) = %d\n", (int) (f1 + d1));
		System.out.printf("(int)f1 + (int)d1 = %d\n", (int) f1 + (int) d1);
		System.out.println("b1 = " + b1);
	}

}
