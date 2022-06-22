public class CoinDemo2 implements Coin {  // Coin인터페이스를 구현, Coin인터페이스가 추상 메서드를 포함하지 않으므로 추가할 코드가 없다.
	public static void main(String[] args) {
		System.out.println("DIME은 " + DIME + "센트입니다.");  // Coin인터페이스의 구현 클래스이므로 직접 상수를 사용할 수 있다.
	}

}
