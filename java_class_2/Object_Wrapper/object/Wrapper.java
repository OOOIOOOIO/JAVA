package object;

public class Wrapper {
	public static void main(String[] args) {
		
	
	// jdk 1.5 ���� ���������� ������ �̷��� ����ؾ� �ߴ�.
	String str = new String("10"); // �ڽ�
	
	// jdk 1.5 ���� (�ڽ� = ����)
	String str2 = "20"; // ���� �ڽ�
	Integer data = 10; // ���� �ڽ� / WrapperŬ������ ���� ������ ���� �ڽ�
	int data2 = data; // ���� ��ڽ� / �Ϲ�Ÿ�Կ� Ŭ����Ÿ���� ���� ������ ��ڽ�
	
	System.out.println(str + str2);
	}
}

/*
			<Wrapper Ŭ����>
 �⺻�� Ÿ���� ��üȭ�� �� �ְ� �����ִ� Ŭ����
  ���� ���� : �⺻�� Ÿ���� ��ä�� �ٷ�� �� ��
  		   �Ű������� ��ü�� �ѱ� ��
  		   �⺻�� Ÿ���� �ƴ� ��ü�� �����ؾ��� ��
  		   ��ü���� �񱳰� �ʿ��� ��
  
 WrapperŬ���� -> �⺻�� Ÿ�� : �ڽ�(Boxing)
 WrapperŬ���� <- �⺻�� Ÿ�� : ��ڻ�(Unboxing)
 Integer > int
 Double < double
 String
*/



