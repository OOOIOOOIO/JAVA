package java_class;

import java.util.Scanner;

public class ArTask { // ȣ������ �� ���� �� ��� ���� ���ϱ�
	public static void main(String[] args) {
		int [] ho = new int[3];
		int sum = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < ho.length; i++) {
			System.out.println(i+1 + "������ �Է��ϼ���(���� : ����)");
			ho[i] = sc.nextInt();
			sum += ho[i];
			
		}
		System.out.println("1�� �� ���� :" + sum + "����");
		avg = Double.parseDouble(String.format("%.2f", (double)sum / ho.length)); 
		// String.format�� Ŭ���������̰� String(����, ��) ������ (���� : %d %s %f...) 
		// Ŭ���� ���ڿ������̱� ������ Double.parseDouble�� ����ȯ ���� ��
		// System.out.printf("��� ���� %.2f", avg); ó�� ��� ����
		System.out.println("��� ���� : " + avg + "����");
		sc.close();
	}
}
