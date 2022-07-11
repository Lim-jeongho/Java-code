public class MethodRefDemo {
	public static void main(String[] args) {
		Showable s = System.out::println;
		s.show("�� �־�");
		
		Utils u = new Utils();
		Operable o = u::add;
		System.out.println(o.operator(20, 30));
		
		Pickable p = String::charAt;
		System.out.println(p.pick("��������", 2));
		
		NewString n = String::new;
		System.out.println(n.getString("���"));
		
		IntArray a = int[]::new;
		int[] array = a.getArray(2);
		array[0] = 0;
		array[1] = 1;
	}
}
