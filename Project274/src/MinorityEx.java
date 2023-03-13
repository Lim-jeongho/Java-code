import java.util.Scanner;

public class MinorityEx {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		int N = in.nextInt();
		int[] A = new int[N+1];
		for(int i=2; i<=N; i++) {
			A[i] = i;
		}
		for(int i=2; i<=Math.sqrt(N); i++) {
			if(A[i] == 0) {
				continue;
			}
			for(int j=i+i; j<=N; j=j+i) {
				A[j] = 0;
			}
		}
		for(int i=M; i<=N; i++) {
			if(A[i] != 0) {
				System.out.println(A[i]);
			}
		}
	}
}