package java_class;

public class CarTest_inh {
	public static void main(String[] args) {
		SuperCar_inh ferrai = new SuperCar_inh("ferrai", "Red", 450000, "sport"); // 내가 초기화한 생성자
		//SuperCar_inh superCar = new SuperCar_inh(); // 기본 새성자
		ferrai.engineStart();
		ferrai.engineStop();
		System.out.println(ferrai); // toString 에서 객체명 수정할 수 있음(주소값이 출력 될 떄);
	}
}
