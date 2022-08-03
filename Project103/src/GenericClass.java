import sec03.generic.Cup;

public class GenericClass {
	public static void main(String[] args) {
		Cup<Boricha> c = new Cup<Boricha>();
		
		c.setBeverage(new Boricha());
		Boricha b = c.getBeverage();
	}
}
