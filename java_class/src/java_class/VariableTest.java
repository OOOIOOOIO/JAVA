package java_class;

public class VariableTest {
	static int data = 0; 
	//static�� �ٽ� �ʱ�ȭ���� �ʰ� �Ʒ��� ����
	//static�� ����������
	
	void f() {
		System.out.println(++data);
	}

	void f2() {
		data = 20;
	}
}
