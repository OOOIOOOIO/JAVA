 package java_class;

public class Access {
	int data = 10;
	public int data2 = 20;
	protected int data3 = 30;
	private int data4 = 40;
	
	
	
	void f() {
				// ������ �̰͵� ��� main������ �� ��
		//data //ctrl + sapce ���� �� �Ķ��� ���� : default(�⺻) -> ���� ��Ű�� �ȿ��� �ٸ� Ŭ�������� ��� ����
		//data2 // �ʷϻ� ���׶�� : public -> ��Ű���� �޶� �ϳ��� ������Ʈ �ȿ� �ִٸ� ��� ���� ����
										// ���� ���� Ŭ������ public ����
		//data3 //����� ���׶�� : protected -> ���� ��Ű�� �ȿ��� �ٸ� Ŭ�������� ��� ����
		//data4 //������ �׸� : private -> ����� ���������� ���� ����	
		
	}


	public int getData4() { // alt + shift + s -> r : ���� ���� ������ ������
		return data4; 		//������ ��������
	}


	public void setData4(int data4) {
		this.data4 = data4; //������ �����ϱ�
	}
}

class Cloud{
	
	void function() {
		// Access a = new Access();
		 
		 
	}
	
}
