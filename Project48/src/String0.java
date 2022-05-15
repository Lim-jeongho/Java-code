public class String0 {
	public static void main(String[] args) {
		String s1 = "Hi, Java";
		String s2 = new String("Hi, Java");
		String s3 = "Hi, Code";
		String s4 = "Hi, java";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		System.out.println(s1.compareTo(s3));  // 문자열을 사전 순으로 비교해 정수 값을 반환
		System.out.println(s1.compareToIgnoreCase(s4));  // 대,소문자를 무시하고 문자열을 사전 순으로 비교
		System.out.println(s3.compareTo(s4));
		System.out.println("Hi, Java".compareToIgnoreCase("hi, java"));
		
		System.out.printf("'J' - 'C' = %d\n" 'J' - 'C');
		System.out.printf("'C' - 'j' = %d\n" 'C' - 'j');
		}

}
