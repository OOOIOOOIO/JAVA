package java_class;

public class SuperCar_inh extends Car_inh { // Car_inh ���
	
	String mode;
	
	public SuperCar_inh() {
		System.out.println("�ڽ� Ŭ������ �⺻ ������");
	}
	
	
	public SuperCar_inh(String brand, String color, int price, String mode) {
		super(brand, color, price); // �޼��帶�� super == Car_inh�� ���� ����
									// ���� �θ� �����ڿ��� �ʱ�ȭ�� �Ǵ°���
		//setPrice(price); //�����ڸ� ���� �ʱ�ȭ�ص� �ǰ� setter�� �ص� �ȴ�.
		this.mode = mode;		
		
	}
	
	
	@Override
		void engineStart() {
			System.out.println("�������� �õ� Ŵ");
			//super.engineStart(); //�θ� ���� �ҷ���
		}
	@Override
		void engineStop() {
			System.out.println("�������� �õ� ��");
			//super.engineStop(); // �θ� ���� �ҷ���
		}
	  
	@Override
		public String toString() {
		
			return "�귣�� : " + brand + "\n���� : " + color + "\n���� : " + getPrice() + "����";
		}
}
