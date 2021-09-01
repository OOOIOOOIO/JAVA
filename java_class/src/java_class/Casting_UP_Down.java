package java_class;

class Car{
	String brand;
	String color;
	int price;
	
	
	public Car() {} // 한번에 초기화가 아니라 하나씩 접근하려고
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart(){
		System.out.println("열쇠로 시동 킴");
		
	}
	
	void engineStop(){
		System.out.println("열쇠로 시동 끔");
	}
	
	
}


class SuperCar extends Car{
	String mode;

	public SuperCar(){}
	
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	void changeMode(String newMode) {
		this.mode = newMode;
		System.out.println("모드가 바뀌었습니다.\n");
	}
	
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	@Override
	void engineStop() {
		System.out.println("음성으로 시동 끔");
	}
	
}


public class Casting_UP_Down {
	
	
	public static void main(String[] args) {
		
		//up casting
		Car noOptionFerrai = new SuperCar(); // 재정의
		
		//down casting : 오류다
		//SuperCar brokenCar = (SuperCar)new Car(); // 형변환하면 에러는 안뜨지만
		//brokenCar.changeMode("스포츠"); // 실행하면 에러발생
		
		Car car = new Car(); // 기본 생성자 있어야됨 없으면 {"", 1, ~~~} 초기화 시켜줘야됨
		SuperCar ferrai = new SuperCar(); // 기본 생성자 없으면 에러
		
		if(car instanceof Car) { // nice 나옴
			System.out.println("nice casting");
		}
		else {
			System.out.println("err : wrong casting");
		}
		
		
		if(ferrai instanceof Car) { // Car을 상속받아서 nice가 나옴
			System.out.println("nice casting");
		}
		else {
			System.out.println("err : wrong casting");
		}
		
		if(car instanceof SuperCar) { // wrong이 나옴 car은 부모가 supercar은 자식이기 때문. 역은 nice가 나옴
			System.out.println("nice casting");
		}
		else {
			System.out.println("err : wrong casting");
		}
		
		if(noOptionFerrai instanceof Car) { // nice가 나옴 noOption은 Car 타입이기 때문
			System.out.println("nice casting");
		}
		else {
			System.out.println("err : wrong casting");
		}
	}
}


/*
	<up casting>
 부모 클래스 타입으로 자식 생성자를 호출하는 것
부모와 자식간의 공통 요소(재정의 매서드)만 사용 가능하며,
자식 클래스의 추가된 것들은 사용할 수 없다.
부모 타입으로 선언 되었기 때문에 부모의 필드만 사용 가능하지만
자식 클래스에서 재정의 했다면 재정의 된 메서드로 사용된다.
부모클래스명 객체 = new 자식생성자();



	<down castin>
 자식 클래스 타입으로 부모 생성자를 호출하는 오류
부모의 범위가 더 크기 때문에 자식에 담을 수 없다.



	<instanceof>
각각의 타입을 확인할 때 사용하는 문법
값 instanceof 클래스타입 : 값이 클래스 타입이니?








*/
