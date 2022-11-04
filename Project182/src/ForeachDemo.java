public class ForeachDemo {
	enum Week { ��, ȭ, ��, ��, ��, ��, �� }
	public static void main(String[] args) {
		int [] n = { 1, 2, 3, 4, 5 };
		String fruits[] = { "���", "����", "�ٳ���", "������", "������", "����" };
		int sum = 0;
		for (int k : n) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("����" + sum);
		
		for (String a : fruits)
			System.out.print(a + " ");
		System.out.println();
		
		for (Week day : Week.values())
			System.out.print(day + "����\t");
		System.out.println();
	}
}
