class Phone{
	String model;
	int value;
	
	void print() {
		System.out.println(value + "만원짜리 " + model + " 스마트폰");
	}
}

public class Phone0 {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.model = "갤럭시 S22";
		myPhone.value = 100;
		myPhone.print();
		
		Phone yourPhone = new Phone();
		yourPhone.model = "iPhone13";
		yourPhone.value = 130;
		yourPhone.print();
	}
}
