import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {
	public static void main(String[] args) {
		String[] s = { "����", "����", "���ѹα���", "����մϴ�" };
		List<String> list = Arrays.asList(s);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
}
