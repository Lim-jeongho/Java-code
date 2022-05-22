import java.util.Scanner;

public class ForeacgAvg {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int scores[] = new int[5];
		int sum = 0;
		
		for(int i = 1; i < scores.length; i++)
			scores[i] = in.nextInt();
		for(int s : scores)
			sum += s;
		System.out.println("ЦђБе = " + sum / 5.0);
	}
}
