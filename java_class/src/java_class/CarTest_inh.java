package java_class;

public class CarTest_inh {
	public static void main(String[] args) {
		SuperCar_inh ferrai = new SuperCar_inh("ferrai", "Red", 450000, "sport"); // ���� �ʱ�ȭ�� ������
		//SuperCar_inh superCar = new SuperCar_inh(); // �⺻ ������
		ferrai.engineStart();
		ferrai.engineStop();
		System.out.println(ferrai); // toString ���� ��ü�� ������ �� ����(�ּҰ��� ��� �� ��);
	}
}
