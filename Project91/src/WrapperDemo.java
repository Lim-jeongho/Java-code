public class WrapperDemo {
	public static void main(String[] args) {
		Integer bi1 = new Integer(10);
		int i1 = bi1.intValue();
		double d = bi1.doubleValue();
		Integer bi2 = 20;
		int i2 = bi2 + 20;
		String s1 = Double.toString(3.14);         // double Ÿ�� �����͸� StringŸ������ ��ȯ
		Double pi = Double.parseDouble("3.14");    // StringŸ���� doubleŸ������ ��ȯ
		Integer bi3 = Integer.valueOf("11", 16);   // 16���� ���� ���ڿ��� 10���� IntegerŸ������ ��ȯ
		System.out.println(bi3);
	}
}
