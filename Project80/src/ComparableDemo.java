import java.util.Arrays;

class Rectangle implements Comparable {
	private int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int findArea() {
		return width * height;
	}
	public String toString() {
		return "»ç°¢Çü[³ÐÀÌ=" + width + ", ³ôÀÌ=" + height + "]";
	}
	
	public int compareTo(Object o) {
		Rectangle other = (Rectangle) o;
		
		if (this.findArea() < other.findArea())
			return -1;
		else if (this.findArea() > other.findArea())
			return 1;
		else
			return 0;
	}
}
public class ComparableDemo {
	public static void main(String[] args) {
		Rectangle[] rectangles = {new Rectangle(3, 5),
				new Rectangle(2, 10), new Rectangle(5, 5)};
		Arrays.sort(rectangles);
		for (Rectangle r : rectangles)
			System.out.println(r); 
	}
}
