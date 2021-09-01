package single;

import java_class_2.Single;

/*
 *  패키지 명에 .를 사용하면 폴더가 하나 더 만들어 진다.
 *  a.b.c.d
 *  a폴더 안에 b폴더 안에 c폴더 안에 d폴더가 생긴다.
 */

public class SingleMain {
	public static void main(String[] args) {
		// single의 생성자를 private으로 해줘서 다른 클래스에서 new 못함
		//java_class_2.Single s = new java_class_2.Single(); 
		
		// 패키즈를 이용한 싱글톤패턴 쓰는법
		java_class_2.Single s= java_class_2.Single.getInstance(); 
		
		//일반적인 싱글톤
		Single s2 = Single.getInstance();
		
		s.sayHello();
		s2.sayHello();
	}
}
