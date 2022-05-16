public class String0 {
	public static void main(String[] args) {
		String s1 = new String("Hi");
		String s2 = new String("Java");
		
		System.out.println("¹®ÀÚ¿­ ±æÀÌ(s1) : " + s1.length());
		char c = s1.charAt(1);
		System.out.println(c);
		
		s1 = s1.concat(s2);
		
		System.out.println(s1 + "!");
	}
}
