package java_class_2;

public class Single { // �̱��� ���� ����� ��
	
	private Single(){} // �⺻ ������ // private���� ���� new ���ϰ� ����
	
	private static Single instance = new Single(); // ���⼭ private ���� �� �ѹ� new ����

	public static Single getInstance() { // private�̴ϱ� get���� �ޱ�
		return instance;
	}

	public void sayHello() {
		System.out.println("�ȳ�");
	}
	
}
/*

				<��Ŭ�� ����>
				
�� �Ѱ��� ��ü���� ������ �ִ� Ŭ������ �̱��� �������� �����Ѵ�.
Ŭ���� ���ο� ��ü�� �����ϰ� �� ��ü�� �ٸ� ������ �������� ����Ѵ�.
���ο� ������ ��ü �ϳ��� �����ϰ� ���̻� �ٸ� ��ü�� �������� ���Ѵ�.

*/