public class Local {
	public static void main(String[] args) {
		int a = 0;
		double b;
		// System.out.print(b); -- 초기화 되지 않고는 사용할 수 없다.
		System.out.println(a);
		// System.out.print(a + c); -- c변수는 아직 선언되지 않았기 문에 사용할 수 없다.
		int c = 0;
		
		for (int e= 0; e < 10; e++) {
			System.out.print(e);
                // int a = 5; -- 정수타입 변수 a를 이미 선언했었으므로 사용할 수 없다.
		}
	}

}
