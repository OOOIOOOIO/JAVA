package generic;

public class GMethodTest {
	
	public static <T> T function(T data) { //public static <T1, T2> T2 function(T2 data){} 이런식으로도 쓸 수 있음
		
		T result;
		
		if(data instanceof Integer) {
			result = (T)"정수";
		}
		else if(data instanceof Double || data instanceof Float){
			result = (T)"실수";
		}
		else if(data instanceof Character){
			result = (T)"문자";
		}
		else if(data instanceof String){
			result = (T)"문자열";
		}
		else {
			result = null;
		}
		
		return result;
	}
}
