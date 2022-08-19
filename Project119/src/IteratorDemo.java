import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("다람쥐");
		list.add("개구리");
		list.add("나비");
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext())
			System.out.print(iterator.next() + "\t");
		System.out.println();
		Collections.sort(list);
		
		while(iterator.hasNext())
			System.out.print(iterator.next() + ",\t");
		System.out.println();
		
		iterator = list.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next() + "->\t");
	}
}