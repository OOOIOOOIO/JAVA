package interfaceTest;

public interface Soldier {
	int arms = 2; //final static�� �����Ǿ� ���� : �ܺο��� ���� �Ұ����ϳ��ٴ� ��
	final static int legs = 2;
	
	abstract void eat(); // �߻��� �޼���
	void work();  // abstract�� �����Ǿ� ����
	void play();
	void sleep();
	void salute();
}	
