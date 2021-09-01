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
		System.out.println("총 수 : " + set.size());
		System.out.println(set);
		
		
		// 반복자 : Iterator -> 반복해서 값을 순서대로 뽑을 때 사용한다.
		Iterator<String> iter = set.iterator(); // 객체 iter에 저장
		
		while(iter.hasNext()) { // iter.hasNext : 혹시 다음에 값이 있니 있으면 true 없으면 false
			System.out.println(iter.next()); // 첫번째부터 순서대로 뽑아줌
		}
		
		
		// remove
		set.remove("AB");
		System.out.println(set.size());
		iter =set.iterator(); // remove로 지웠으니 다시 iter에 저장
		
		while(iter.hasNext()) { 
			System.out.println(iter.next());
		}
		
		System.out.println(set);
		
	}
	
}

/*
	
				<Set 집합>

 집합은 중복집합이 아니라면 중복되는 원소를 포함할 수 없다.
값(객체, 데이터)을 중복해서 저장할 수 없다. 저장된 값들은
인덱스가 없기 때문에 저장 순서가 고정되어 있지 않다.
주 용도는 검색이다.

 -메서드 
size() : 저장된 값의 수
add() : 값 추가
iterator() : 검색
remove(Object O) : 값 삭제

 쓰는 법
Set<E> 객체명 = new HashSet<E>();

HashSet : Set 컬렉션을 구현하는 대표적인 클래스
*/