package object;

import java.util.Random;

public class ObjectTest {
	public static void main(String[] args) {
		String data1 = new String("ABC"); // 힙메모리
		String data2 = new String("ABC"); // new : 객체의 저장공간이 따로 생성됨
		
		
		// constant pool : 상수들이 보관되어 있는 pool. 하나의 값이 있으면 공유
		String data3 = "ABC"; // 스택메모리
		String data4 = "ABC"; 	// ABC의 값을 data1~4가 공유.
								// new가 있다면 한번 더 거쳐서 공유한다고 생각하면 편함 
								// new일 때 == 쓰고싶으면 .intern() 쓰기
		Random r = new Random();
		Random r2 = new Random();
		String [] arStr = { // 클래스 배열(스트링 타입)
				new String(data1),
				new String(data2),
				new String(data3)
		};
		// intern() : constant pool에 같은 값을 검색하여 값의 주소값을 반환해 준다.
		
		
//		System.out.println(data1 == data2); // == 주소값 연산자 :false
//		System.out.println(data1.equals(data2)); // 값을 비교 : true
//		System.out.println(data1.intern() == data2.intern()); 
//											// 주소값을 가져옴 : true
//		System.out.println(data3 == data4); // == 주소값 연산자 : ture
//		
////		r =r2;
//		System.out.println(r.equals(r2));
//		System.out.println(r == r2);
//		
//		System.out.println(data3.hashCode()); // 주소값 보는법
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
			<Obeject 클래스>

1. equals() : 두 주소값이 같은지 확인하는 메서드. 단, String 클래스에서 equals를 재정의 하기 때문에
			 String 타입이라면 값을 비교한다. 
			
2. hashCode() : 두 객체가 같은지 확인하는 메서드(collection  framework에서 다시 다룸)
			   데이터 관리 기법 중 하나이며 다량의 데이터를 저장하는 것이 가능하고
			   빠른 검색이 가능하다. String 클래스에서 오버라이딩 했으며, 값이 같으면
			   같은 해쉬코드를 갖는다.

*/