package java_class;

public class Car_inh {
	
	final int wheel = 4; // final : ���
	public String brand;
	protected String color;
	private int price;
	
	public Car_inh() { //�⺻ ������
		System.out.println("�θ� Ŭ������ �⺻ ������");				
	}

	public Car_inh(String brand, String color, int price) {
		this.brand = brand; //������ ���� �ʱ�ȭ
		this.color = color;
		this.price = price;
	}
	
	
	
	void engineStart() {
		System.out.println("����� �õ� Ŵ");
	}
	
	void engineStop() {
		System.out.println("����� �õ� ��");
		
	}

	public int getPrice() { //����
		return price;
	}

	public void setPrice(int price) { //����
		this.price = price;
	}
	
	
	
	
}
