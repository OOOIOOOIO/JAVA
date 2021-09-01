package innerAnonyClass;

public class OuterClass {
	int outData;
	
	public OuterClass() {
		System.out.println("외부 클래스 생성자 호출됨");
		
	}
	
	public void showOuter() {
		System.out.println("외부 클래스의 메서드 호출됨");
		
	}
	
	
	
	public class InnerClass{ // 내부클래스, 캡슐화
		int inData;
		
		public InnerClass() {
			System.out.println("내부 클래스 생성자 호출됨");
			
		}
		
		public void showInner() {
			outData = 20;		// 내부에서 외부 필드를 사용
			System.out.println("내부 클래스의 메서드 호출됨");
			System.out.println("outData :" + outData);
			showOuter();		// 내부에서 외부 필드를 사용
		}
	}
	
	
	public static void main(String[] args) {
		OuterClass out = new OuterClass(); 				 // 외부 클래스 객체 생성 및 외부 클래스 생성자 호출
		OuterClass.InnerClass in = out.new InnerClass(); // 내부 클래스 객체 생성  및 내부 클래스 생성자 호출
														 // 내부 클래스 쓰는 방법
		
		in.showInner();
	}
}


/*

			<내부 클래스>

 클래스 내부에 클래스를 선언하여 외부 클래스의 필드 접근에 용이하기 위해서 씀
내부 클래스의 필드를 사용하기 위해서는 외부 클래스에서 내부 클래스를 객체화 해야한다.
 
 내부 클래스는 GUI(Graphic User Interface) 개발시 많이 사용됨.
ex) a라는 버튼과 b라는 버튼이 있다고 하자. 두 버튼의 기능이 서로 다르다면
	클래스를 별도로 만드는 것 보다 내부 클래스로 만들어 사용하는 것이 적합하다.
 내부클래스를 사용하는 이유 
-캡슐화 : A클래스에서 b라는 작업이 자주 쓰이고, 이 작업은 b클래스를 만들어야 쉽게 관리할 수 있을 떄
	   다른 클래스에서 b작업이 필요 없거나, b클래스를 외부에 노출시키고 싶지 않을 때 사용한다.
	   
	   
	   
 - 쓰는 법 (벤다이어그램 생각하면 편함)
외부클래스 객체명 = new 외부클래스생성자();
외부클래스명.내부클래스명 객체명 = 외부클래스객체명.new 내부클래스생성자();

*/