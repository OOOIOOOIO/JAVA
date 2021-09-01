package generic;

public class GMethod {
	public static void main(String[] args) {
		System.out.println(GMethodTest.function(10));
		System.out.println(GMethodTest.function('c'));
		System.out.println(GMethodTest.function("ASDF"));
		System.out.println(GMethodTest.function(10.5f));
	}
}
