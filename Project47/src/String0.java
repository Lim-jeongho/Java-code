public class String0 {
	public static void main(String[] args) {
		String s1 = "Hi, java";
		String s2 = "Hi, java";
		String s3 = new String("Hi, java");
		String s4 = new String("Hi, java");
		
		System.out.println("s1 == s2 -> " + (s1 == s2));
		System.out.println("s1 == s3 -> " + (s1 == s3));
		System.out.println("s3 == s4 -> " + (s3 == s4));
		s1 = s3;
		System.out.println("s1 == s3 -> " + (s1 == s3));
	}
}
