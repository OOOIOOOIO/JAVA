package object;

public class Wrapper2 {
	
	public static void add(Object a, Object b) { // �Ű������� ��ü�� �ѱ� ��
		// ���ڿ��� �ٲ��ְ� �����ϴ� �޼���
		System.out.println(String.valueOf(a) + String.valueOf(b));
	}
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		
		Object [] arData = {"�����", 10, 20.9}; // Object Ÿ���� java.lang�� �ִ� ��� Ŭ������ ���� Ŭ����
		
		Object [] arData2 = {	// Object Ÿ���� �� ������ �̷��� ���� ��
				new Integer(10),	// Wrapper �̿�, �ڽ�
				new Double(13.5),
				new String("��������")
		};
		System.out.println(arData[0]);
		System.out.println(arData[1]);
		System.out.println(arData[2]);
		System.out.println("");
		System.out.println(arData2[0]);
		System.out.println(arData2[1]);
		System.out.println(arData2[2]);
		System.out.println("");
		
		add(new Integer(10), new Integer(40));
	}
}
