import static java.util.Arrays.sort;
import java.util.Calendar;
public class StaticImport {
	public static void main(String[] args) {
		int[] data = { 3, 5, 1, 7};
		
		sort(data);
		System.out.println(Calendar.JANUARY);
		Calendar.getInstance();
	}

}
