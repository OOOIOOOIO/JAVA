package java_class;

class Car{
	String brand;
	String color;
	int price;
	
	
	public Car() {} // �ѹ��� �ʱ�ȭ�� �ƴ϶� �ϳ��� �����Ϸ���
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart(){
		System.out.println("����� �õ� Ŵ");
		
	}
	
	void engineStop(){
		System.out.println("����� �õ� ��");
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
		System.out.println("��尡 �ٲ�����ϴ�.\n");
	}
	
	@Override
	void engineStart() {
		System.out.println("�������� �õ� Ŵ");
	}
	
	@Override
	void engineStop() {
		System.out.println("�������� �õ� ��");
	}
	
}


public class Casting_UP_Down {
	
	
	public static void main(String[] args) {
		
		//up casting
		Car noOptionFerrai = new SuperCar(); // ������
		
		//down casting : ������
		//SuperCar brokenCar = (SuperCar)new Car(); // ����ȯ�ϸ� ������ �ȶ�����
		//brokenCar.changeMode("������"); // �����ϸ� �����߻�
		
		Car car = new Car(); // �⺻ ������ �־�ߵ� ������ {"", 1, ~~~} �ʱ�ȭ ������ߵ�
		SuperCar ferrai = new SuperCar(); // �⺻ ������ ������ ����
		
		if(car instanceof Car) { // nice ����
			System.out.println("nice casting");
		}
		else {
			System.out.println("err : wrong casting");
		}
		
		
		if(ferrai instanceof Car) { // Car�� ��ӹ޾Ƽ� nice�� ����
			System.out.println("nice casting");
		}
		else {
			System.out.println("err : wrong casting");
		}
		
		if(car instanceof SuperCar) { // wrong�� ���� car�� �θ� supercar�� �ڽ��̱� ����. ���� nice�� ����
			System.out.println("nice casting");
		}
		else {
			System.out.println("err : wrong casting");
		}
		
		if(noOptionFerrai instanceof Car) { // nice�� ���� noOption�� Car Ÿ���̱� ����
			System.out.println("nice casting");
		}
		else {
			System.out.println("err : wrong casting");
		}
	}
}


/*
	<up casting>
 �θ� Ŭ���� Ÿ������ �ڽ� �����ڸ� ȣ���ϴ� ��
�θ�� �ڽİ��� ���� ���(������ �ż���)�� ��� �����ϸ�,
�ڽ� Ŭ������ �߰��� �͵��� ����� �� ����.
�θ� Ÿ������ ���� �Ǿ��� ������ �θ��� �ʵ常 ��� ����������
�ڽ� Ŭ�������� ������ �ߴٸ� ������ �� �޼���� ���ȴ�.
�θ�Ŭ������ ��ü = new �ڽĻ�����();



	<down castin>
 �ڽ� Ŭ���� Ÿ������ �θ� �����ڸ� ȣ���ϴ� ����
�θ��� ������ �� ũ�� ������ �ڽĿ� ���� �� ����.



	<instanceof>
������ Ÿ���� Ȯ���� �� ����ϴ� ����
�� instanceof Ŭ����Ÿ�� : ���� Ŭ���� Ÿ���̴�?








*/
