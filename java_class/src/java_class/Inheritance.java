package java_class;



class A{
	int data = 10;
	
	public A() {
	System.out.println("부모 클래스 생성자");
	}
	
	void show() {
		System.out.println("A 클래스");
	}
	
}


class B extends A{
	
	void check() {
		show();
	}
	@Override
	void show() {
	System.out.println("B클래스"); // 상속은 받지만 수정하고 싶을 떄 재정의
		super.show();
	}
	
}


public class Inheritance {
	public static void main(String[] args) {
		B instance = new B(); // 자식 클래스를 쓸 때 자식이 부모 클래스를 상속 받았으면
		instance.check();	  // 자식 클래스를 호출하더라도 부모 클래스를 먼저 실행함
	
	}
	
	
	
}  


/*

				<상속 Inheritance>
				
 	 기존에 사용중인 클래스의 필드를 다른 클래스에서 계속 사용을
	해야한다면 상속을 받고 부모 클래스의 필드를 마치 자신의 것 처럼
	사용할 수 있다.

 	 부모 클래스로부터 상속받은 멤버 변수의 접근 권한이 private일 때
	- 부모 클래스의 생성자를 호출해서 초기화 시킬 수 있다.
	- 부모 클래스에 setter 메서드를 통해서 초기화 시킬 수 있다.
	- 변수에 저장된 값은 getter 메서드를 통해서 가져올 수 있다.

 	 부모 클래스로부터 상속받은 멤버 변수의 접근 권한이 protect일 때
	- 자식 클래스에서 접근이 가능하기 때문에 this를 사용해서 초기화 한다.
	- 자식 클래스에서 접근이 가능하므로 getter 메서드를 사용하지 않고 
 	 변수명으로 값에 직접 접근하면 된다.
 
 	 자식 클래스의 생성자가 실행되기 전에 부모 클래스의 생성자가 먼저 실행된다.
 	 실행할 부모 클래스의 생성자를 지정하지 않으면 부모 클래스의 기본 생성자가 
	자동으로 실행된다.
 	자동으로 입력되는 super()를 지우더라도 자바 컴파일러가 자동으로 인식한다.

 	 다중 상속은 불가능하다.


			<다형성 polymorphism>
			
 	 다형성이란 하나의 메소드가 서로 다른 클래스에서 다향하게 실행되는 것을
	말한다. 다형성을 구현하기 위해서는 다형성을 구현할 메소드를 포함할 클래스에게
	부모클래스가 상속해 줘야한다. 부모 클래스와 자식 클래스에 같은 이름의 메소드가 있어야 하고,
	자식 클래스에서는 재정의(Overriding) 해야한다. 따라서 다형성의 종류에는
	Overloading, Overriding이 있다.
	
  
class A{

	필드

}


class B extends A{		 //상속하기    A : 부모 상위 슈퍼 기반 클래스 
					           		B : 자식 하위 서브 파생 클래스
	필드	

}



*/
