package java_class;

public class OverLoading {
	
	void add(int num1, int num2) {
		System.out.println("두 정수의 합");
		System.out.println(num1 + num2);
	}
	
	void add(int num1, int num2, int num3) {
		System.out.println("세 정수의 합");
		System.out.println(num1 + num2 + num3);
	}
	
	void add(double num1, double num2) {
		System.out.println("두 실수의 합");
		System.out.println(num1 + num2);
	}
	
	
	
	public static void main(String[] args) {
		OverLoading o = new OverLoading();
		o.add(10, 20); // 이게 오버로딩
		o.add(10.5, 20.9);
		o.add(1,  2, 3);
	}
}
/*
	<오버 로딩(over loading)>
	 
 같은이름의 메서드라도 매개변수의 갯수 혹은 타입이 다르면
선언이 가능하다.


*/