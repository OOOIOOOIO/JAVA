package generic;

public class GMethodTest {
	
	public static <T> T function(T data) { //public static <T1, T2> T2 function(T2 data){} �̷������ε� �� �� ����
		
		T result;
		
		if(data instanceof Integer) {
			result = (T)"����";
		}
		else if(data instanceof Double || data instanceof Float){
			result = (T)"�Ǽ�";
		}
		else if(data instanceof Character){
			result = (T)"����";
		}
		else if(data instanceof String){
			result = (T)"���ڿ�";
		}
		else {
			result = null;
		}
		
		return result;
	}
}
