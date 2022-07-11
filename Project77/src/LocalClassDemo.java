public class LocalClassDemo {
	private String s1 = "¿ÜºÎ";
	
	void method() {
		int x = 1;
		class LocalClass {
			String s2 = "³»ºÎ";
			String s3 = s1;
			
			public void show() {
				System.out.println("Áö¿ª Å¬·¡½º");
			}
		}
		LocalClass lc = new LocalClass();
		System.out.println(lc.s2);
		lc.show();
	}
	
	public static void main(String[] args) {
		LocalClassDemo lcd = new LocalClassDemo();
		lcd.method();  
	}
}
