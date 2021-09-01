package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ArrayList
 * 컬레션 클래스 중 가장 많이 사용되는 클래스
 * 배열을 이용해서 값을 저장한다.
 * 
 * 인덱스를 이용해서 배열 요소에 빠르게 접근 가능하지만
 * 크기를 늘리기 위해선 새로운 배열을 생성하고 기존의 값들을 옮겨야 하므로 느리다.
 * 
 * 정적배열 : 크기가 고정되어있다.
 * 동적배열 : 크기가 고정되어있지 않다.
 * 
 * 배열 : 속도가 빠르지만 고정된 메모리 양으로 인해 나중에 늘릴 수 없다.
 * ArrayList : 메모리 양은 마음대로 수정할 수 있지만 배열보다 느리다.
 * 
 * List라는 인터페이스 안에 ArrayList라는 클래스가 있으며
 *  List<> 객체명 = new ArrayList<>();
 *  ArrayList<> 객체명 = new ArrayList<>();
 * => 두개의 기능은 똑같다. List라고 해주면 경우에 따라 LinkedList 등을 사용할 수 있어 유연성이 높다.
 */





public class ArList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); // 동적배열 생성법
		ArrayList<Integer> list2 = null;
		
		// 안타깝다.... 이렇게 하면 안되는데...
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
		
		list2 = new ArrayList<>(list.subList(2, 5)); // slicing이랑 비슷함 2, 3, 4( 마지막-1 까지)
		System.out.println(list); // 파이썬 list와 비슷
		System.out.println("list.sublist(2, 5) : " + list2);
		System.out.println("");
		
		System.out.println("정렬 전 : " + list);
		Collections.sort(list); // 오름차순, 내림차순을 하고싶으면 .sort -> .reverse 해주기
		System.out.println("정렬 후 : " + list);
		Collections.reverse(list); // 거꾸로 만들기(정가운대를 기준으로 양쪽 바꾼것)
		System.out.println("내림차순 : " + list);
		System.out.println("");
		
		//섞기 : shuffle()
		Collections.shuffle(list); // 섞기
		System.out.println("섞은 후 : " + list);
		
	
		 
	}
}
