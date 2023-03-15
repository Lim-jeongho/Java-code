import java.util.Scanner;

public class NotSquareEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long Min = sc.nextLong();
		long Max = sc.nextLong();
		boolean[] Check = new boolean[(int) (Max - Min + 1)];
		for(long i=2; i*i<=Max; i++) {
			long pow = i*i;
			long start_index = Min / pow;
			if(Min % pow != 0)
				start_index++;
			for(long j=start_index; pow*j<=Max; j++) {
				Check[(int) ((j*pow) - Min)] = true;
			}
		}
		int count = 0;
		for(int i=0; i<=Max-Min; i++) {
			if(!Check[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}