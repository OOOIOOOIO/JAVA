package singleton;

public class IronMan {
	
	private IronMan() {} // ��ü ���� ���Ƴ�
	
	public static IronMan getInstance() { //��ü�ϳ��� ����
		
		IronMan im = new IronMan();
		return im;	
	}
	
	public static void fight() {
		System.out.println("�� �߻�");
		
	}
	
	public void walk() {
		System.out.println("���ư���.");
		
	}
}
