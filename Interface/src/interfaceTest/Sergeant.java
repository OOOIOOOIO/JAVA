package interfaceTest;

public class Sergeant extends Army{
	
	public void eat() {
		System.out.println("�ȸ԰� �ڷ� ���� ");

	}
	
	@Override
	public void sleep() {
		System.out.println("�Ϸ����� �ܴ�");
	}
	
	@Override
	public void play() {
		System.out.println("�Ϸ����� ���");
	}
	
}
