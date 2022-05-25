public class VarArgs {
	public static void main(String[] args) {
		printSum(1, 2, 3, 4, 5);
		printSum(10, 20, 30);
	}

	public static void printSum(int... v) {
		int sum = 0;
		for(int i : v)
			sum+= i;
		System.out.println(sum);
	}
}
