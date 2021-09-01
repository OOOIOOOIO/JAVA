package java_class;

public class MainMethodTest {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("None");
		}
		
		else {
			for (int j = 0; j < args.length; j++) {
				System.out.println(args[j]);				
			}
		}
	}
}

// <cmd창에서 자바 실행하는 법>
// cmd
// cd 파일경로
// javac 클래스이름.java (컴파일)
// 클래스파일이 생성됨
// cd .. (뒤로가기)
// java 패키지이름.클래스이름 ~~하고싶은거 (실행)