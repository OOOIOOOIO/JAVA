package object;

public class ObjectTest2 {
	
	int data1 = 10;
	int data2 = 20;
	int data3 = 30;
	
	@Override
	public String toString() { // toString ������	
		 return ""+data1+data2+data3;
	}
	
	public ObjectTest2(int data1) { // ������
		this.data1 = data1;
	}
	
	public static void main(String[] args) {
		ObjectTest2 o = new ObjectTest2(90); // data1 = 90
		char[] word = {'��', '��'};
		System.out.println(o); // Ŭ���� Ÿ���� .toString()�޼��尡 ��������
		System.out.println(word);
		System.out.println(word.length);
		
		// ��ü���� ����� �� �׻� �ڿ� toString()�� �ִµ� �����Ǿ� �ִ�
		// ���� ��ü���� �ּҰ��� ����ִµ�  ���� ���ϴ� ���� toString()����
		// �����Ǹ� ���ָ� �����ϰ� �̿��� �� �ִ�.
	}
}
