package single;

import java_class_2.Single;

/*
 *  ��Ű�� �� .�� ����ϸ� ������ �ϳ� �� ����� ����.
 *  a.b.c.d
 *  a���� �ȿ� b���� �ȿ� c���� �ȿ� d������ �����.
 */

public class SingleMain {
	public static void main(String[] args) {
		// single�� �����ڸ� private���� ���༭ �ٸ� Ŭ�������� new ����
		//java_class_2.Single s = new java_class_2.Single(); 
		
		// ��Ű� �̿��� �̱������� ���¹�
		java_class_2.Single s= java_class_2.Single.getInstance(); 
		
		//�Ϲ����� �̱���
		Single s2 = Single.getInstance();
		
		s.sayHello();
		s2.sayHello();
	}
}
