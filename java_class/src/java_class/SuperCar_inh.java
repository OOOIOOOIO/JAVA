package java_class;

public class SuperCar_inh extends Car_inh { // Car_inh 상속
	
	String mode;
	
	public SuperCar_inh() {
		System.out.println("자식 클래스의 기본 생성자");
	}
	
	
	public SuperCar_inh(String brand, String color, int price, String mode) {
		super(brand, color, price); // 메서드마냥 super == Car_inh로 보면 편함
									// 따라서 부모 생성자에서 초기화가 되는거임
		//setPrice(price); //생성자를 통해 초기화해도 되고 setter로 해도 된다.
		this.mode = mode;		
		
	}
	
	
	@Override
		void engineStart() {
			System.out.println("음성으로 시동 킴");
			//super.engineStart(); //부모꺼 까지 불러옴
		}
	@Override
		void engineStop() {
			System.out.println("음성으로 시동 끔");
			//super.engineStop(); // 부모꺼 까지 불러옴
		}
	  
	@Override
		public String toString() {
		
			return "브랜드 : " + brand + "\n색상 : " + color + "\n가격 : " + getPrice() + "만원";
		}
}
