public class WrapperDemo {
	public static void main(String[] args) {
		Integer bi1 = new Integer(10);
		int i1 = bi1.intValue();
		double d = bi1.doubleValue();
		Integer bi2 = 20;
		int i2 = bi2 + 20;
		String s1 = Double.toString(3.14);         // double 타입 데이터를 String타입으로 변환
		Double pi = Double.parseDouble("3.14");    // String타입을 double타입으로 변환
		Integer bi3 = Integer.valueOf("11", 16);   // 16진수 숫자 문자열을 10진수 Integer타입으로 변환
		System.out.println(bi3);
	}
}
