package object;

public class Wrapper2 {
	
	public static void add(Object a, Object b) { // 매개변수를 객체로 넘길 때
		// 문자열로 바꿔주고 연결하는 메서드
		System.out.println(String.valueOf(a) + String.valueOf(b));
	}
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		
		Object [] arData = {"얄루얄루", 10, 20.9}; // Object 타입은 java.lang에 있는 모든 클래스의 조상 클래스
		
		Object [] arData2 = {	// Object 타입을 쓸 때에는 이렇게 많이 씀
				new Integer(10),	// Wrapper 이용, 박싱
				new Double(13.5),
				new String("하이하이")
		};
		System.out.println(arData[0]);
		System.out.println(arData[1]);
		System.out.println(arData[2]);
		System.out.println("");
		System.out.println(arData2[0]);
		System.out.println(arData2[1]);
		System.out.println(arData2[2]);
		System.out.println("");
		
		add(new Integer(10), new Integer(40));
	}
}
