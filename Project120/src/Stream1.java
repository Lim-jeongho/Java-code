import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Stream1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Integer> gt10 = new ArrayList<>();
		Random r = new Random();
		for(int i = 0; i < 20; i++)
			list.add(r.nextInt(30));
		
		for(int i : list)
			if(i > 10)
				gt10.add(i);
		Collections.sort(gt10);
		System.out.println(gt10);
		list.stream().filter(i -> i > 10).sorted().forEach(x -> System.out.print(x + " "));
	}
}