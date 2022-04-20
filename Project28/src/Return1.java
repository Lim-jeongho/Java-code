public class Return1 {

	public static void main(String[] args) {
		printScore(95);
		printScore(110);

	}
	public static void printScore(int score) {
		if (score <= 0 || score >= 100) {
			System.out.println("잘못된 점수 : " + score);
			return;
		}
		System.out.println("점수 : " + score);
	}

}
