package java_class_2;

public class Arr_for {
	public static void main(String[] args) {
//		String [] arData = {"�ȳ�", "�ݰ���", "�̸���", "����"};
//		
//		for(String i : arData) { // ���� for��
//			System.out.println(i);
//		}
		
		int[][] arrScore = {
				{10, 20, 30},
				{12, 22, 32},
				{14, 24, 34},
				{16, 26, 36},
				{18, 28, 38}
		};
		int total = 0;
		double avg = 0.0;
		int cnt = 0;
		// �� �л��� ������ ��� ����ϱ� ���� for������. ���̽��̶� �Ȱ����� �� �� ������
		
		for(int [] arScore : arrScore) { // �� ���� arScore[]�� �����. �迭�� �޴°� �߿�
			total = 0;
			cnt++;
			for(int score : arScore) { // ���� �� ��ҵ��� score�� �־���
				total += score;
			}
			System.out.println(cnt + "�� ���� : " + total + "��");
			avg = Double.parseDouble(String.format("%2f", (double)total / arScore.length));
			System.out.println(cnt + "�� ��� : " + avg + "��");
			
		}
	}
}
