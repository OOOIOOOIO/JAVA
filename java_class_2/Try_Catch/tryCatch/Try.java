package tryCatch;

public class Try {
	public static void main(String[] args) {
		
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) { //Exception e : ���� �� ����
			System.out.println("0���� ���� �� �����ϴ�.");
			System.out.println(e.getMessage()); // ���� �α� �������
			System.out.println("����");
			
		}
		
	}
}


/*

			<����ó��>
���� : �ɰ��� ����
���� : �� �ɰ��� ����

- ���� ��
1)
try{
	������ �� ���� �ִ� ����
}
catch(�����̸� ��ü��){
	���� �߻��� ������ ����
}


2)
try{
	������ �� ���� �ִ� ����
}
catch(�����̸�1 ��ü��1){
	���� �߻��� ������ ����
}
catch(�����̸�2 ��ü��2){
	���� �߻��� ������ ����
}


3)
try{
	�õ��� ����
}
catch(�����̸� ��ü��){
	���� �߻��� ������ ����
}
finally{
	���ܹ߻� ���ο� ������� ������ ������ ����
}


4)
try{
	�õ��� ����
}
catch(�����̸� 1 | �����̸�2 ��ü��){
	�� �� �ϳ��� �߻��� �õ��� ����
}


*/