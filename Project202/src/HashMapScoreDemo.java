import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapScoreDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		scoreMap.put("김성일", 97);
		scoreMap.put("황기태", 86);
		scoreMap.put("홍길동", 98);
		scoreMap.put("김남기", 71);
		scoreMap.put("한연주", 85);
		System.out.println("HashMap의 요소 개수 : " + scoreMap.size());
		Set<String> keys = scoreMap.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = scoreMap.get(name);
			System.out.println(name + " : " + score);
		}
	}
}