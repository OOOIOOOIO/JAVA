package java_class;


public class Car_Class {
	int price;          //�ʵ� : ����, �޼���(�Լ�)
	String color;		//�Ķ��� ��������
	String brand;		//���ֻ� ��������
	
	Car_Class(){} //������ �����ε�
	
//	public Car_Class(int price, String color, String brand) {	
//		this.price = price;
//		this.color = color;
//		this.brand = brand;
//	} // alt + shift + s -> o �Ŀ� generate �ڵ����� �����ڰ� �������
	
	public Car_Class(int price, String color, String brand){ 
		//������ ����(���� �������� ������ �⺻���� �Ǿ�����
		//�����ڸ� ���� �����ϸ� �޼���ó�� �Ű������� �ʿ���.
		//�׷��� Car_Class = new Car_Class(�Ű�����, ....)�� ���ذ���
		//�׸��� �ʱ�ȭ�� �ʿ��� �� �����ڸ� ��
		this.price = price; //this.price�� �ʵ� / price �Ű�����
		this.color = color; //this�� �ʵ�� �޼ҵ� �Ǵ� �������� �Ű������� ������ ��
		this.brand = brand; //��Ȯ�� �����ϱ� ���� ����
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
		System.out.println("�귣�� : " + brand + "\n���� : " + color + "\n���� : " + price);
		
	}
	
	
	public static void main(String[] args) {
		//��üȭ
		// momyCar���� �� �ν��Ͻ� ������� ��
		// Ŭ������() : �⺻ ������ : Ŭ������ �����ϸ� �ڵ����� ����Ǵ� ������
		
		Car_Class momyCar = new Car_Class(9000, "Benz", "green"); //���� �����ڸ� �̿��� ��
		//Car_Class dadyCar = new Car_Class(); //�����ε�� ���� �ȳ� �����ε�����ڷ� ��
		//Car_Class myCar = new Car_Class(); //�⺻�ϋ�
		momyCar.showInfo();
//		momyCar.brand = "Benz"; // �⺻�ϋ�
//		momyCar.color = "Black";
//		momyCar.price = 90000;
//		
//		System.out.println(momyCar);
//		dadyCar.showInfo();
			
	}
	
	
}

/*
	<Ŭ���� ����>
 
class Ŭ������{
�ʵ�(����. �޼���)


}

================================

	<Ŭ���� ���>

Ŭ������ ��ü�� = new Ŭ������(); -> ��üȭ
��ü��.�ʵ�;

=================================

	<������>
 = new Ŭ������{};���� Ŭ������()�� ���� ��
 �޼���� ���� ����� ���Ӥ��� ������, ������ ������
 ����Ÿ�Ե� ����. ���� �޼����� �θ��� �ʴ´�,

ex) int[] arr = new int[4];
    Scanner sc = new Scanner(System.in);
    
    
*/