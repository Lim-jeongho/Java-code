import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("E yyyy.MM.dd'at' hh:mm:ss a z");
		System.out.println(sdf1.format(d));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			d= sdf2.parse("2023-02-25");
		} catch (ParseException e) {
		}
		System.out.println(sdf1.format(d));
	}
}
