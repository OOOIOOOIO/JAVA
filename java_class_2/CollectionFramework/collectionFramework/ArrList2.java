package collectionFramework;

import java.util.ArrayList;

public class ArrList2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//10���� 80������ ������ list�� add�ϱ�
		
		for (int i = 1; i < 9; i++) {
			list.add(i*10);
		}
		
		System.out.println(list);
		list.add(90);
		System.out.println(list);
		
		// indexof() : ���� ������ ���� �ε��� ��ȣ�� ����, ���� ������ -1�� ����
		int idx = list.indexOf(10);
		if(idx != -1) {
			list.add(idx+1, 15); // add(�ε�����ȣ, ��)
			
		}
		else {
			list.add(0, 15);
		}
		System.out.println(list);
		
		
		// �ǽ� 60�� 600���� �ٲٱ�
		
		//set(�ε�����ȣ, ��) : �ε�����ȣ�� �ִ� ���� ���ο� ������ �ٲٱ�
		list.set(list.indexOf(60), 600); 
		
		// �ǽ� 10, 15 �����
		
		//��Ƽ��Ÿ�� remove(��) / ������ƮŸ�� : remove(�ε�����ȣ)
		list.remove(new Integer(15));
		list.remove(list.indexOf(10)); // �ε��� ��ȣ�� ����
		
		System.out.println(list);
		
		
		
	}
}
