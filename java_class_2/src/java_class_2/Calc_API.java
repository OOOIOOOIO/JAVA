package java_class_2;
/**
 * This one is Calculator
 * @author David
 * @since 2021 07 21
 */



public class Calc_API { //<br> -> html에서 \n임 api에서는 html언어 쓰임
	/**
	 * To add the following numbers.<br>
	 * For example<br>
	 * add(1, 3) return 4
	 * 
	 * @param num1 : First Integer for add
	 * @param num2 : Last Integer for add
	 */
	public static void add(int num1, int num2) {
		 System.out.println(num1 + num2);

	}
	
	//나눗셈 메서드(try catch)
	/**
	 * Divide num1 by num2.<br>
	 * You can see a Message "Divide by zero"<br>
	 * if you give num2 zero<br>
	 * 
	 * For example<br>
	 * div(10, 5) = 2<br>
	 * div(10, 0) = "Divide by zero"
	 * 
	 * @param num1
	 * @param num2
	 */
	public static void div(int num1, int num2) {
		try {
			System.out.println(num1 / num2);
		} catch (Exception e) {
			System.out.println("Divide by zero");
		}

	}
	
	public static void main(String[] args) {
		Calc_API.add(1, 3);
	}
	
	
}
/// javadoc 만드는 법
// export -> java -> javadoc -> jdk경로 -> 워크스패이스에 저장
// javadoc: error - java.lang.IllegalArgumentException 
// classpath 삭제하고 이클립스 재부팅하면 만들어짐