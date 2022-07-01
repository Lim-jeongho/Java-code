class Icon {
	interface Touchable {
		void touch();
	}
}
public class InnerInterface implements Icon.Touchable {
	public void touch() {
		System.out.println("�������� ��ġ�Ѵ�.");
	}
	
	public static void main(String[] args) {
		Icon.Touchable btn = new InnerInterface();
		btn.touch();
	}
}
