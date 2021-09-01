package java_class;

public class Car_inh {
	
	final int wheel = 4; // final : 상수
	public String brand;
	protected String color;
	private int price;
	
	public Car_inh() { //기본 생성자
		System.out.println("부모 클래스의 기본 생성자");				
	}

	public Car_inh(String brand, String color, int price) {
		this.brand = brand; //생성자 선언 초기화
		this.color = color;
		this.price = price;
	}
	
	
	
	void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}
	
	void engineStop() {
		System.out.println("열쇠로 시동 끔");
		
	}

	public int getPrice() { //게터
		return price;
	}

	public void setPrice(int price) { //세터
		this.price = price;
	}
	
	
	
	
}
