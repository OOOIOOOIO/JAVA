package java_class;


public class Car_Class {
	int price;          //필드 : 변수, 메서드(함수)
	String color;		//파란색 전역변수
	String brand;		//자주색 지역변수
	
	Car_Class(){} //생성자 오버로딩
	
//	public Car_Class(int price, String color, String brand) {	
//		this.price = price;
//		this.color = color;
//		this.brand = brand;
//	} // alt + shift + s -> o 후에 generate 자동으로 생성자가 만들어짐
	
	public Car_Class(int price, String color, String brand){ 
		//생성자 선언(따로 선언하지 않으면 기본으로 되어있음
		//생성자를 따로 선언하면 메서드처럼 매개변수가 필요함.
		//그래서 Car_Class = new Car_Class(매개변수, ....)를 해준거임
		//그리고 초기화가 필요할 떄 생성자를 씀
		this.price = price; //this.price는 필드 / price 매개변수
		this.color = color; //this는 필드와 메소드 또는 생성자의 매개변수가 동일할 떄
		this.brand = brand; //명확히 구분하기 위해 쓰임
	}
	
	
	double speedUp(double speed){
		speed++;
		return speed;
	}
	
	
	double speedDown(double speed){
		speed--;
		return speed;
	}
	
	
	void showInfo() {
		System.out.println("브랜드 : " + brand + "\n색상 : " + color + "\n가격 : " + price);
		
	}
	
	
	public static void main(String[] args) {
		//객체화
		// momyCar같은 걸 인스턴스 변수라고 함
		// 클래스명() : 기본 생성자 : 클래스를 선언하면 자동으로 선언되는 생성자
		
		Car_Class momyCar = new Car_Class(9000, "Benz", "green"); //만든 생성자를 이용한 것
		//Car_Class dadyCar = new Car_Class(); //오버로드라서 오류 안남 오버로드생성자로 들어감
		//Car_Class myCar = new Car_Class(); //기본일떄
		momyCar.showInfo();
//		momyCar.brand = "Benz"; // 기본일떄
//		momyCar.color = "Black";
//		momyCar.price = 90000;
//		
//		System.out.println(momyCar);
//		dadyCar.showInfo();
			
	}
	
	
}

/*
	<클래스 선언>
 
class 클래스명{
필드(변수. 메서드)


}

================================

	<클래스 사용>

클래스명 객체명 = new 클래스명(); -> 객체화
객체명.필드;

=================================

	<생성자>
 = new 클래스명{};에서 클래스명()과 같은 놈
 메서드와 같은 기능을 가ㅣㅈ고 있지만, 리턴이 없으며
 리턴타입도 없다. 따라서 메서드라고 부르지 않는다,

ex) int[] arr = new int[4];
    Scanner sc = new Scanner(System.in);
    
    
*/