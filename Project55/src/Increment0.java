public class Increment0 {

	public static void main(String[] args) {
		int[] x = { 0 };
		System.out.println("ȣ�� ���� x[0] = " + x[0]);
		increment(x);
		System.out.println("ȣ�� ���� x[0] = " + x[0]);
	}

	public static void increment(int[] n) {
		System.out.print("increment() �޼��� �ȿ��� ");
		System.out.print("n[0] = " + n[0] + " --> ");
		n[0]++;
		System.out.println("n[0] = " + n[0]);
	}
}
