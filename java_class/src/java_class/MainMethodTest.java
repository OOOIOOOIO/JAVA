package java_class;

public class MainMethodTest {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("None");
		}
		
		else {
			for (int j = 0; j < args.length; j++) {
				System.out.println(args[j]);				
			}
		}
	}
}

// <cmdâ���� �ڹ� �����ϴ� ��>
// cmd
// cd ���ϰ��
// javac Ŭ�����̸�.java (������)
// Ŭ���������� ������
// cd .. (�ڷΰ���)
// java ��Ű���̸�.Ŭ�����̸� ~~�ϰ������ (����)