import java.awt.GraphicsEnvironment;

public class FontDemo {
	public static void main(String[] args) {
		GraphicsEnvironment e =
				GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] fontNames = e.getAvailableFontFamilyNames();
		for (String s : fontNames)
			System.out.println(s);
	}
}