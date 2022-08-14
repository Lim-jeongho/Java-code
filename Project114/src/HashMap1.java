import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	public static void main(String[] args) {
		Map<String, Integer> m  = new HashMap<>();
		m.put("사과", 5);
		m.put("바나나", 3);
		m.put("포도", 10);
		m.put("딸기", 1);
		System.out.println(m.size() + "종류의 과일이 있습니다.");
		
		for(String key : m.keySet())
			System.out.println(key + "가 " + m.get(key) + "개 있습니다.");
		String key = "바나나";
		if (m.containsKey(key))
			System.out.println(key + "가 " + m.get(key) + "개 있습니다.");
		m.remove("사과");
		System.out.println("사과를 없앤 후 과일은 " + m.size() + "종류입니다.");
		m.clear();
		System.out.println("모두 없앤 후 과일은 " + m.size() + "종류입니다");
	}
}