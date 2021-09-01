package java_class;


public class MethodTest { //class 안에서 함수 만들어야됨 !
	
	static int add(int a, int b) { // 1번째 방법(함수가 1개일 떄 주로 쓰임)
		System.out.println("add 메서드입니다.\n");
		return a + b;
	}
	
	int minus(int a, int b) {
		System.out.println("minus 메서드입니다.\n");
		return a - b;
	}
	public static void main(String[] args) {
		
		// static이란 컴파일하자마자 제일 우선순위가 높게 실행됨
		// 그래서 함수를 쓰고 싶으면 
		// 1. 함수에 static을 붙여준다.
		// 2. 함수를 소속으로 접근한다.
		System.out.println(add(3, 7)); //1번째 방법으로 출력
		
		MethodTest m = new MethodTest(); //2번쨰 방법
		System.out.println(m.minus(7, 3)); //2번째 방법으로 출력
	}
}
