package java_class;


public class MethodTest { //class �ȿ��� �Լ� �����ߵ� !
	
	static int add(int a, int b) { // 1��° ���(�Լ��� 1���� �� �ַ� ����)
		System.out.println("add �޼����Դϴ�.\n");
		return a + b;
	}
	
	int minus(int a, int b) {
		System.out.println("minus �޼����Դϴ�.\n");
		return a - b;
	}
	public static void main(String[] args) {
		
		// static�̶� ���������ڸ��� ���� �켱������ ���� �����
		// �׷��� �Լ��� ���� ������ 
		// 1. �Լ��� static�� �ٿ��ش�.
		// 2. �Լ��� �Ҽ����� �����Ѵ�.
		System.out.println(add(3, 7)); //1��° ������� ���
		
		MethodTest m = new MethodTest(); //2���� ���
		System.out.println(m.minus(7, 3)); //2��° ������� ���
	}
}
