public class Block {
	static int sumTen;
	
	static {
		int sum = 0;
		for (int i = 1; i <= 10; i ++)
			sum += i;
		sumTen = sum;
	}
	public static void main(String[] args) {
		System.out.println(sumTen);
	}

}
