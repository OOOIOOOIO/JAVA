package java_class;

public class Array {
	public static void main(String[] args) {
//		int [] arData = new int[4]; // 1. new�� �� ��� �ڵ����� 0 �ʱ�ȭ ��
//		int arPrice[] = {1000, 2000, 3000}; // 2. �ѹ��� �ʱ�ȭ�ϱ�
//		
//		System.out.println(arData);
//		arData[0] = 10;
//		System.out.println(arData[0]);		
//		System.out.println(arData.length); // �迭 ���� ���ϱ�
//		
//		for(int i = 0; i < arPrice.length; i++) {
//			System.out.println(arPrice[i]);
//		}
		
		String haha = "�����ٶ󸶹ٻ�";
		int[] kaka = new int[4];
		kaka[0] = 4;
		
		System.out.println(haha.length()); // ���ڿ� ����
		System.out.println(kaka.length); // �迭 ����
		
		System.out.println(haha.charAt(0)); // ���ڿ� �ε���
		System.out.println(kaka[0]); // �迭 �ε���
	}
}
