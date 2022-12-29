public class TimeComplexityEx2 {
	public static void main(String[] args) {
		int N = 100000;
		int cnt = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.println("¿¬»êÈ½¼ö : " + cnt++);
			}
		}
	}
}