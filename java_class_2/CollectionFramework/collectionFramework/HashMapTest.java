package collectionFramework;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		//����
		HashMap<String, Integer> fruitMap = new HashMap<>(); //<key, value>
		
		Collection<Integer> price = null; // value�� collection Ÿ���̱� ������ value���� �ޱ����� ����
		ArrayList<Integer> arPrice = new ArrayList<Integer>(); // value�� �ε����� ���� ���� ����
		Set<String> arName = null;
		
		fruitMap.put("���", 1000); // .put : �߰��ϱ�
		fruitMap.put("��", 2000); // .put : �߰��ϱ�
		fruitMap.put("�ڵ�", 3000); // .put : �߰��ϱ�
		fruitMap.put("����", 4000); // .put : �߰��ϱ�
		
		System.out.println(fruitMap.get("�ڵ�") + "��"); // get(key) : vaule ��������
		
		//value
		System.out.println(fruitMap.values());
		price = fruitMap.values();
		
		
		for(int i : price) { // ���̽� for�� for i in price :�� in���� �����ϸ� ����
			System.out.println(i + "��"); // Ű���� �����ؼ� values�� ����
		}
		
		price.forEach(data->arPrice.add(data)); 
		
		System.out.println(arPrice.get(0)); // �ε��� ��ȣ�� value ���
		
		// �ٷ� ArrayList�� �� ��´�. �ֳ��ϸ� values�� �÷��� Ÿ���̱� ����
		// arraylist���� collection Ÿ���� �� ���� �����̱� ������
		// forEach�� price�� data���� ����ְ� �� data���� add()�� arPrice�� �������Ѵ�.
		
		
		//key
		System.out.println(fruitMap.keySet());
		arName = fruitMap.keySet();
		Iterator<String> name = arName.iterator();
		
		while(name.hasNext()) {
			System.out.println(name.next());
		}
		
		
		
		
		//key�� value -> getKey, getValue�� �������� ��
		Set<Entry<String, Integer>> set = fruitMap.entrySet(); // entrySet�� ������ �����ؾߵ�. �� ��
		Iterator<Entry<String, Integer>> iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, Integer> e = iter.next(); // Entry�� Map�̶�� �������̽� �ȿ� �ֱ� ������ ������ ������
			System.out.println("���� �̸� :" + e.getKey());
			System.out.println("���� ���� :" + e.getValue());
		}
		
	}
}


/*
				<HashMap>
 Key�� Value �ѽ�(pair. entry)�� ����ȴ�.
�׷��Ƿ� �˻��� �����ϴ�.

[key, value] �� ��( ���̽� ��ųʸ��� ����ϱ���)

 key�� �ߺ��� �Ұ����ϴ�.(Set)
 value�� �ߺ��� �����ϴ�.(Collection)
 
 key<-> hash table <-> ��  => hash table�� ������ ���� ��
 
 Map �ڷᱸ���� ������ ������ �ʱ� ������
 Set���� ���� �� iterator�� ���� ������ �ο��޾Ƽ� ���;� �Ѵ�.
 
  -���� ��
 HashMap<> ��ü�� = new HashMap<>(�뷮);
 
  -�޼���
clear() : ��� ��(������, ��ü) ���� // c��� free()�� ����Ѱ�?\
containsKey(Object key) : key�� �ִ��� �˻�
containsValue(Object value) : value�� �ִ��� �˻�
get(Object key) : key�� �ְ� value�� �����´�
isEmpty() : ����ִ��� Ȯ��
KeySet() : HashMap�� ����Ǿ� �ִ� ��� key���� ����� ����(Set Ÿ��)
values() : HashMap�� ����Ǿ� �ִ� ��� value���� ����� ����(collection Ÿ��)
entrySet() : key value�� ������ ����Ǿ� �ִ� ����
 
 
*/