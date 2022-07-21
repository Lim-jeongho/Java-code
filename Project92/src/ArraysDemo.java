import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		char[] a1 = { 'J', 'a', 'v', 'a' };
		char[] a2 = Arrays.copyOf(a1,  a1.length);
		System.out.println(a2);	
		String[] sa = { "����ũ", "����", "����", "�ٳ���" };
		print(sa);
		Arrays.sort(sa);     // �迭�� ���Ҹ� ����
		print(sa);
		System.out.println(Arrays.binarySearch(sa,  "����"));  // �迭�� ���� Ž���Ѵ�
		Arrays.fill(sa,  2, 4, "��Ÿ");   // �迭�� �ε��� 2������ 4-1������ ���Ҹ� '��Ÿ'���ڿ��� ä���
		print(sa);
	}
	static void print(Object[] oa) {
		for(Object o : oa)
			System.out.print(o + " ");
		System.out.println();
	}
}
