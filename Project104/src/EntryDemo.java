public class EntryDemo {
	public static void main(String[] args) {
		Entry<String, Integer> e1 = new Entry<>("�輱��", 20);
		Entry<String, String> e2 = new Entry<>("��Ÿ", "���");
		
		System.out.println(e1.getKey() + " " + e1.getValue());
		System.out.println(e2.getKey() + " " + e2.getValue());
	}
}
