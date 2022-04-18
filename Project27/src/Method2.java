public class Method2 {

	public static void main(String[] args) {
		System.out.println("гу(1~10) : " + sum(1,10));
		System.out.println("гу(10~100) : " + sum(10,100));
		System.out.println("гу(100~1000) : " + sum(100,1000));
	}
	public static int sum(int i1, int i2) {
		int sum = 0;
		for (int i = i1; i <= i2; i++)
			sum += i;
		return sum;
	}

}
