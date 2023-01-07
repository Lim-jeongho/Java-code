import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GoodNumberEx {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int Result = 0;
		long A[] = new long[N];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(A);
		for(int k=0; k<N; k++) {
			long find = A[k];
			int i = 0;
			int j = N - 1;
			while(i < j) {
				if(A[i] + A[j] == find) {
					if(i != k && j != k) {
						Result++;
						break;
					} else if(i == k) {
						i++;
					} else if(j == k) {
						j--;
					}
				} else if(A[i] + A[j] < find) {
					i++;
				} else {
					j--;
				}
			}
		}
		System.out.println(Result);
		bf.close();
	}
}