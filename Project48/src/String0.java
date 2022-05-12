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
		}

}
