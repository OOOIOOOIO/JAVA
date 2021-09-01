package object;

import java.util.Random;

public class ObjectTest {
	public static void main(String[] args) {
		String data1 = new String("ABC"); // ���޸�
		String data2 = new String("ABC"); // new : ��ü�� ��������� ���� ������
		
		
		// constant pool : ������� �����Ǿ� �ִ� pool. �ϳ��� ���� ������ ����
		String data3 = "ABC"; // ���ø޸�
		String data4 = "ABC"; 	// ABC�� ���� data1~4�� ����.
								// new�� �ִٸ� �ѹ� �� ���ļ� �����Ѵٰ� �����ϸ� ���� 
								// new�� �� == ��������� .intern() ����
		Random r = new Random();
		Random r2 = new Random();
		String [] arStr = { // Ŭ���� �迭(��Ʈ�� Ÿ��)
				new String(data1),
				new String(data2),
				new String(data3)
		};
		// intern() : constant pool�� ���� ���� �˻��Ͽ� ���� �ּҰ��� ��ȯ�� �ش�.
		
		
//		System.out.println(data1 == data2); // == �ּҰ� ������ :false
//		System.out.println(data1.equals(data2)); // ���� �� : true
//		System.out.println(data1.intern() == data2.intern()); 
//											// �ּҰ��� ������ : true
//		System.out.println(data3 == data4); // == �ּҰ� ������ : ture
//		
////		r =r2;
//		System.out.println(r.equals(r2));
//		System.out.println(r == r2);
//		
//		System.out.println(data3.hashCode()); // �ּҰ� ���¹�
//		System.out.println(data4.hashCode());
//		System.out.println(data1.hashCode());
//		System.out.println(data2.hashCode());
		
		System.out.println(arStr);
		//arStr[0] == "ABC" = false
		System.out.println(arStr[0].intern() == "ABC");
		//arStr[0].equals("ABC")
		
	}
}


/*
			<Obeject Ŭ����>

1. equals() : �� �ּҰ��� ������ Ȯ���ϴ� �޼���. ��, String Ŭ�������� equals�� ������ �ϱ� ������
			 String Ÿ���̶�� ���� ���Ѵ�. 
			
2. hashCode() : �� ��ü�� ������ Ȯ���ϴ� �޼���(collection  framework���� �ٽ� �ٷ�)
			   ������ ���� ��� �� �ϳ��̸� �ٷ��� �����͸� �����ϴ� ���� �����ϰ�
			   ���� �˻��� �����ϴ�. String Ŭ�������� �������̵� ������, ���� ������
			   ���� �ؽ��ڵ带 ���´�.

*/