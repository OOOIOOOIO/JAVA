package java_class;
/*
 * Ȧ���� ¦����, ¦���� ȫ���� �ٲ��ִ� �޼���
 * 1���� ���� �Է��� ���������� �������� �����ִ� �޼���
 * �� ������ ������ �޼���
 * 
 * ������ �ѱ۷� �ٲ��ִ� �޼���
 * �� 1024 -> �ϰ��̻�
 */
public class MethodTask {
	
	void change(int input) { // �Է¹��� ¦���� Ȧ����, Ȧ���� ¦����
		if(input / 2 == 0) {
			System.out.println(input-1);
		}
		else if(input / 2 != 0) {
			System.out.println(input+1);
		}
	}
	
	
	void total(int end){ //1���� ���� �Է��� �������� ��
		int result = 0;
		
		if(end > 1) {
			for(int i = 1; i < end+1; i++) {
				result += i;
				
			}
			System.out.println(result);
		}
		else {
			System.out.println("1���� ū ���� �Է��ϼ���");
		}
		
	}
	
	
	void div(int num1, int num2) { // �Է¹��� �� �� ������
		double result = 0.0;
		if(num1 != 0 && num2 != 0) {
			
			result = Double.parseDouble(String.format("%.3f", (double)num1 / num2));
			System.out.println(result);
		}
		else {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
	}
	
	
	void changeToHangle(String data){
		String hangle = "�����̻�����ĥ�ȱ�";  //���ڿ��� �迭ó�� �����ϵ� []�� �����Ƿ� ����ϴ� ���� �ٸ���
		String result = "";				  //���ڿ��� .charAt(index) / �迭�� [index]
		int num = Integer.parseInt(data); //���ڿ��� ���̴� .length() / �迭�� length �ֳ��ϸ� ���ڿ��� String Ŭ����Ÿ���̱� ����
		
		for (int i = 0; i < data.length(); i++) { //Ŭ������ length()Ŭ������ �����ؾߵ�
			result += hangle.charAt(num % 10);
			num /= 10; //charAT(index) == �迭�� []. Ŭ������ Ŭ������ ��ߵ�
		}
		
		for(int i = data.length() -1; i > -1; i--) {
			System.out.println(result.charAt(i));
		}
	}
	
	
	
	
	public static void main(String[] args) {
		MethodTask m = new MethodTask();
		
		m.change(10);
		m.total(10);
		m.div(5, 5);
		m.changeToHangle("1024");
	}
}
