package java_class;

public class Variable { //���Ⱑ Ŭ����

	public static void main(String[] args) {
		int i = 100;
		long l = 100L;
		double d1 = 1.23;
		float f = 1.24F;
		char c = 'A';
		String s = "�輺ȣ"; //String�� class Ÿ��
		String num1 = "1";
		String num2 = "2";
		int num3 = 3;
		
//		System.out.println(i);
//		System.out.println(l);
//		System.out.println(d1);
//		System.out.println(f);
//		System.out.println(c);
//		System.out.println(s);
		//print�� println�� �״�� �������� ������ ������
		//printf�� ���Ĺ��ڸ� ����Ѵ�.""�ȿ��� ����Ѵ�.
		System.out.printf("%d\n", i);
		System.out.printf("%d\n", l);
		System.out.printf("%f\n", d1);
		System.out.printf("%f\n", f);
		System.out.printf("%c\n", c);
		System.out.printf("%s\n", s);
		
		//���� ����ȯ �ϴ¹�
		
		System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
		//�������� ���ڿ�����
		
		System.out.println("" + num3 + 9); 
		//�������� ����������. "" + ~~~�� �� ���ڷ� �ٲ�
		
		
		//VariableTest���� ��������
		
		VariableTest vt = new VariableTest(); // ��üȭ
		vt.f();
		vt.f();
		vt.f();
		vt.f();
		vt.f();
		vt.f();
		vt.f();
		vt.f();
		vt.f2();
		vt = new VariableTest(); //new�� ���� ���� �ٽ� ������ ��
		vt.f();					// ������ data�� static�� ���༭ �ٽ� ������ 
		
		
	}

}
