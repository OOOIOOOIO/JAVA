package java_class;

public class Array {
	public static void main(String[] args) {
//		int [] arData = new int[4]; // 1. new를 쓸 경우 자동으로 0 초기화 됨
//		int arPrice[] = {1000, 2000, 3000}; // 2. 한번에 초기화하기
//		
//		System.out.println(arData);
//		arData[0] = 10;
//		System.out.println(arData[0]);		
//		System.out.println(arData.length); // 배열 길이 구하기
//		
//		for(int i = 0; i < arPrice.length; i++) {
//			System.out.println(arPrice[i]);
//		}
		
		String haha = "가나다라마바사";
		int[] kaka = new int[4];
		kaka[0] = 4;
		
		System.out.println(haha.length()); // 문자열 길이
		System.out.println(kaka.length); // 배열 길이
		
		System.out.println(haha.charAt(0)); // 문자열 인덱스
		System.out.println(kaka[0]); // 배열 인덱스
	}
}
