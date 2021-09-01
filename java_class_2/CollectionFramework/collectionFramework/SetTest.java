package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("AB");
		set.add("B");
		set.add("O");
		set.add("A");
		set.add("A");
		set.add("A");
		set.add("A");
		
		// size
		System.out.println("�� �� : " + set.size());
		System.out.println(set);
		
		
		// �ݺ��� : Iterator -> �ݺ��ؼ� ���� ������� ���� �� ����Ѵ�.
		Iterator<String> iter = set.iterator(); // ��ü iter�� ����
		
		while(iter.hasNext()) { // iter.hasNext : Ȥ�� ������ ���� �ִ� ������ true ������ false
			System.out.println(iter.next()); // ù��°���� ������� �̾���
		}
		
		
		// remove
		set.remove("AB");
		System.out.println(set.size());
		iter =set.iterator(); // remove�� �������� �ٽ� iter�� ����
		
		while(iter.hasNext()) { 
			System.out.println(iter.next());
		}
		
		System.out.println(set);
		
	}
	
}

/*
	
				<Set ����>

 ������ �ߺ������� �ƴ϶�� �ߺ��Ǵ� ���Ҹ� ������ �� ����.
��(��ü, ������)�� �ߺ��ؼ� ������ �� ����. ����� ������
�ε����� ���� ������ ���� ������ �����Ǿ� ���� �ʴ�.
�� �뵵�� �˻��̴�.

 -�޼��� 
size() : ����� ���� ��
add() : �� �߰�
iterator() : �˻�
remove(Object O) : �� ����

 ���� ��
Set<E> ��ü�� = new HashSet<E>();

HashSet : Set �÷����� �����ϴ� ��ǥ���� Ŭ����
*/