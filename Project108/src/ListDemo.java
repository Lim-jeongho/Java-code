import java.util.Arrays;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		String[] names1 = { "»ç½¿", "È£¶ûÀÌ", "¹Ù´ÙÇ¥¹ü", "°õ" };
		List<String> list = Arrays.asList(names1);
		list.set(1, "¾Þ¹«»õ");
		for (String s : list)
			System.out.print(s + "\t");
		System.out.println();
		
		list.sort((x, y) -> x.length() - y.length());
		String[] names2 = list.toArray(new String[list.size()]);
		for (int i = 0; i < names2.length; i++)
		System.out.print(names2[i] + "\t");
	}
}
