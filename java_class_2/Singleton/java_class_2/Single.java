package java_class_2;

public class Single { // 싱글톤 패턴 만드는 법
	
	private Single(){} // 기본 생정자 // private으로 절대 new 못하게 막음
	
	private static Single instance = new Single(); // 여기서 private 으로 딱 한번 new 해줌

	public static Single getInstance() { // private이니까 get으로 받기
		return instance;
	}

	public void sayHello() {
		System.out.println("안녕");
	}
	
}
/*

				<싱클톤 패턴>
				
단 한개의 객체만을 가지고 있는 클래스를 싱글톤 패턴으로 구현한다.
클래스 내부에 객체를 생성하고 그 객체를 다른 곳에서 공통으로 사용한다.
내부에 생성한 객체 하나만 존재하고 더이상 다른 객체를 생성하지 못한다.

*/