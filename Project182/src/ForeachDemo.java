public class ForeachDemo {
	enum Week { 월, 화, 수, 목, 금, 토, 일 }
	public static void main(String[] args) {
		int [] n = { 1, 2, 3, 4, 5 };
		String fruits[] = { "사과", "포도", "바나나", "복숭아", "오렌지", "딸기" };
		int sum = 0;
		for (int k : n) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("합은" + sum);
		
		for (String a : fruits)
			System.out.print(a + " ");
		System.out.println();
		
		for (Week day : Week.values())
			System.out.print(day + "요일\t");
		System.out.println();
	}
}
