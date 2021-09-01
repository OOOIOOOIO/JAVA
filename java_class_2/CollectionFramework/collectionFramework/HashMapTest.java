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
		//과일
		HashMap<String, Integer> fruitMap = new HashMap<>(); //<key, value>
		
		Collection<Integer> price = null; // value는 collection 타입이기 때문에 value들을 받기위해 선언
		ArrayList<Integer> arPrice = new ArrayList<Integer>(); // value를 인덱스로 쓰기 위해 선언
		Set<String> arName = null;
		
		fruitMap.put("사과", 1000); // .put : 추가하기
		fruitMap.put("배", 2000); // .put : 추가하기
		fruitMap.put("자두", 3000); // .put : 추가하기
		fruitMap.put("수박", 4000); // .put : 추가하기
		
		System.out.println(fruitMap.get("자두") + "원"); // get(key) : vaule 가져오기
		
		//value
		System.out.println(fruitMap.values());
		price = fruitMap.values();
		
		
		for(int i : price) { // 파이썬 for문 for i in price :를 in으로 생각하면 편함
			System.out.println(i + "원"); // 키값을 정렬해서 values가 나옴
		}
		
		price.forEach(data->arPrice.add(data)); 
		
		System.out.println(arPrice.get(0)); // 인덱스 번호로 value 출력
		
		// 바로 ArrayList에 못 담는다. 왜냐하면 values는 컬렉션 타입이기 때문
		// arraylist보다 collection 타입이 더 넓은 범주이기 때문에
		// forEach로 price에 data들을 담아주고 그 data들을 add()로 arPrice에 담아줘야한다.
		
		
		//key
		System.out.println(fruitMap.keySet());
		arName = fruitMap.keySet();
		Iterator<String> name = arName.iterator();
		
		while(name.hasNext()) {
			System.out.println(name.next());
		}
		
		
		
		
		//key와 value -> getKey, getValue로 가져오는 법
		Set<Entry<String, Integer>> set = fruitMap.entrySet(); // entrySet은 저렇게 선언해야됨. 한 쌍
		Iterator<Entry<String, Integer>> iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, Integer> e = iter.next(); // Entry는 Map이라는 인터페이스 안에 있기 때문에 저렇게 선언함
			System.out.println("과일 이름 :" + e.getKey());
			System.out.println("과일 가격 :" + e.getValue());
		}
		
	}
}


/*
				<HashMap>
 Key와 Value 한쌍(pair. entry)로 저장된다.
그러므로 검색에 용이하다.

[key, value] 한 쌍( 파이썬 딕셔너리랑 비슷하구나)

 key는 중복이 불가능하다.(Set)
 value는 중복이 가능하다.(Collection)
 
 key<-> hash table <-> 값  => hash table을 통해한 쌍이 됨
 
 Map 자료구조는 순서를 따지지 않기 때문에
 Set으로 묶은 후 iterator를 통해 순서를 부여받아서 나와야 한다.
 
  -쓰는 법
 HashMap<> 객체명 = new HashMap<>(용량);
 
  -메서드
clear() : 모든 값(데이터, 객체) 제거 // c언어 free()랑 비슷한가?\
containsKey(Object key) : key가 있는지 검사
containsValue(Object value) : value이 있는지 검사
get(Object key) : key를 주고 value를 가져온다
isEmpty() : 비어있는지 확인
KeySet() : HashMap에 저장되어 있는 모든 key들이 저장된 형태(Set 타입)
values() : HashMap에 저장되어 있는 모든 value들이 저장된 형태(collection 타입)
entrySet() : key value가 쌍으로 저장되어 있는 형태
 
 
*/