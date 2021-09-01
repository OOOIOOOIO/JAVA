package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ArrayList
 * �÷��� Ŭ���� �� ���� ���� ���Ǵ� Ŭ����
 * �迭�� �̿��ؼ� ���� �����Ѵ�.
 * 
 * �ε����� �̿��ؼ� �迭 ��ҿ� ������ ���� ����������
 * ũ�⸦ �ø��� ���ؼ� ���ο� �迭�� �����ϰ� ������ ������ �Űܾ� �ϹǷ� ������.
 * 
 * �����迭 : ũ�Ⱑ �����Ǿ��ִ�.
 * �����迭 : ũ�Ⱑ �����Ǿ����� �ʴ�.
 * 
 * �迭 : �ӵ��� �������� ������ �޸� ������ ���� ���߿� �ø� �� ����.
 * ArrayList : �޸� ���� ������� ������ �� ������ �迭���� ������.
 * 
 * List��� �������̽� �ȿ� ArrayList��� Ŭ������ ������
 *  List<> ��ü�� = new ArrayList<>();
 *  ArrayList<> ��ü�� = new ArrayList<>();
 * => �ΰ��� ����� �Ȱ���. List��� ���ָ� ��쿡 ���� LinkedList ���� ����� �� �־� �������� ����.
 */





public class ArList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); // �����迭 ������
		ArrayList<Integer> list2 = null;
		
		// ��Ÿ����.... �̷��� �ϸ� �ȵǴµ�...
		list.add(10); // 0
		list.add(70); // 1
		list.add(60); // 2
		list.add(40); // 3
		list.add(50); // 4
		list.add(20); // 5
		list.add(30); // 6
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.size());
		System.out.println("");
		
		list2 = new ArrayList<>(list.subList(2, 5)); // slicing�̶� ����� 2, 3, 4( ������-1 ����)
		System.out.println(list); // ���̽� list�� ���
		System.out.println("list.sublist(2, 5) : " + list2);
		System.out.println("");
		
		System.out.println("���� �� : " + list);
		Collections.sort(list); // ��������, ���������� �ϰ������ .sort -> .reverse ���ֱ�
		System.out.println("���� �� : " + list);
		Collections.reverse(list); // �Ųٷ� �����(������븦 �������� ���� �ٲ۰�)
		System.out.println("�������� : " + list);
		System.out.println("");
		
		//���� : shuffle()
		Collections.shuffle(list); // ����
		System.out.println("���� �� : " + list);
		
	
		 
	}
}
