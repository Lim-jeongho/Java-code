import java.util.Scanner;

public class SumEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		int sum = 0;
		for(int i=0; i<cNum.length; i++) {
			sum += cNum[i] - '0';
		}
		System.out.print(sum);
	}
}