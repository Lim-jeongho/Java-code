package sec06.other;

import sec06.One;
public class One2 extends One {
	void print() {
		System.out.println(child);
		System.out.println(anybody);
		// System.out.println(secret); -- �ڽ� Ŭ������ �θ�� �ٸ� ��Ű���� ������ private ����� ������ �� ����.
		// System.out.println(roommate); -- �ڽ� Ŭ������ �θ�� �ٸ� ��Ű���� ������ default ����� ������ �� ����.
	}
}
