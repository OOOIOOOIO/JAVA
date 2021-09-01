package collectionFramework;

import java.util.ArrayList;

public class ArrList2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//10부터 80까지의 값들을 list에 add하기
		
		for (int i = 1; i < 9; i++) {
			list.add(i*10);
		}
		
		System.out.println(list);
		list.add(90);
		System.out.println(list);
		
		// indexof() : 값이 있으면 값의 인덱스 번호를 리턴, 값이 없으면 -1을 리턴
		int idx = list.indexOf(10);
		if(idx != -1) {
			list.add(idx+1, 15); // add(인덱스번호, 값)
			
		}
		else {
			list.add(0, 15);
		}
		System.out.println(list);
		
		
		// 실습 60을 600으로 바꾸기
		
		//set(인덱스번호, 값) : 인덱스번호에 있던 값을 새로운 값으로 바꾸기
		list.set(list.indexOf(60), 600); 
		
		// 실습 10, 15 지우기
		
		//인티저타입 remove(값) / 오브젝트타입 : remove(인덱스번호)
		list.remove(new Integer(15));
		list.remove(list.indexOf(10)); // 인덱스 번호로 삭제
		
		System.out.println(list);
		
		
		
	}
}
