package java_class;

public class Access_2 {
	
	void funtion(){
		
		Access a = new Access();
		//Access 클래스파일에서 클래스불러옴
		System.out.println(a.data3);
		
	}
	
	public static void main(String[] args) {
		Access_2 a = new Access_2();
		a.funtion(); // Access_2 클래스 선언하고 메서드 사용
		
	}
}
