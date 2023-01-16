import java.util.Scanner;

public class DesSortEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] A = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			A[i] = Integer.parseInt(str.substring(i, i + 1));
		}
		for (int i = 0; i < str.length(); i++) {
			int Max = i;
			for (int j = i + 1; j < str.length(); j++) {
				if (A[j] > A[Max])
					Max = j;
			}
			if (A[i] < A[Max]) {
				int temp = A[i];
				A[i] = A[Max];
				A[Max] = temp;
			}
		}
		for (int i = 0; i< str.length(); i++) {
			System.out.print(A[i]);
		}
	}
}