public class Dowhile2 {

	public static void main(String[] args) {
		int i = 10;
		do {
			i++;
		} while (i < 5);
		System.out.println("do~while문 실행 후 : " + i);
		
		i = 10;
		while (i < 5) {
			i++;
		}
		System.out.println("while문 실행 후 : " + i);
	}

}
