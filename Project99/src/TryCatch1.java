public class TryCatch1 {
	public static void main(String[] args) {
		int[] array = { 0, 1, 2 };
		try {
			int x = array[3];
		} catch (Exception e) {
			System.out.println("�Ǽ�!");
		} catch (ArrayIndexOutOfBoundsException e) {  // Exception ��ü�� ó���ϴ� catch ��Ͽ��� ��� ���ܸ� ó���ϹǷ� �� catcg ����� ���� �� ������. ���� ������ ������ �߻��Ѵ�
			System.out.println("���Ұ� �������� �ʽ��ϴ�");
		}
		System.out.println("����");
	}

}
