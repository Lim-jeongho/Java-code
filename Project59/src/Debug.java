public class Debug {
	public static void main(String[] args) {
		int d, m, n1, n2, n3;
		d =0;
		n1 = 2;
		n2 = n1 * n1;
		n3 = n2 * n2;
		m = n2 / n1;
		System.out.printf("%d\n", d);
		System.out.printf("%d\n", n1);
		System.out.printf("%d\n", n2);
		System.out.printf("%d\n", n3);
		System.out.printf("%d\n", m);
		// System.out.printf("%d\n", n1):       -- ���๮�� ����Ŭ������ ������ �ʾ� ���� ���� �߻�.
		// System.out.printf("%d\n", n2 / d);   -- 0���� ���� �� �����Ƿ� ���� ���� �߻�.
	}
}
