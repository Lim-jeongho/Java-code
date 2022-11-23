import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapScoreDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		scoreMap.put("�輺��", 97);
		scoreMap.put("Ȳ����", 86);
		scoreMap.put("ȫ�浿", 98);
		scoreMap.put("�賲��", 71);
		scoreMap.put("�ѿ���", 85);
		System.out.println("HashMap�� ��� ���� : " + scoreMap.size());
		Set<String> keys = scoreMap.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = scoreMap.get(name);
			System.out.println(name + " : " + score);
		}
	}
}