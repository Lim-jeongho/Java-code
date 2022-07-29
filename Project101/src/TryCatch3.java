public class TryCatch3 {
	public static void main(String[] args) {
		int dividend = 10;
		try {
			int divisor = Integer.parseInt(args[0]);
			System.out.println(dividend / divisor);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("원소가 존재하지 않습니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("항상 실행됩니다.");
		}
		System.out.println("종료.");
	}
}
