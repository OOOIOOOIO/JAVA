package java_class;

import javax.swing.JOptionPane;

public class ArrShop {
	public static void main(String[] args) {
		int sum = 0;
		double avg = 0.0;
		
		int[][] arrIncome = new int[2][3]; // ������ ����
		int[] arAgeSum = new int[2]; // ����, �Ƶ�
		int[] arBranSum = new int[3]; // ������ ����
		double[] arAgeAvg = new double[2]; // ����, �Ƶ� 
		double[] arBranAvg = new double[3]; // ������ ����
		
		String inputMsg = "������� �Է��ϼ���.";
		String result = "";
		
		String[][] arrName = {
				{"������A", "ȫ����A", "������A"},
				{"������K", "ȫ����K", "������K"}
		};
		
		String[] arAgeName = {"����", "Ű��"};
		String[] arBranName = {"������", "ȫ����", "������"};
		
		int rLength = arrIncome.length; // �����ϱ� ���� �׳� 1���� �迭(��)
		int cLength = arrIncome[0].length; // �����ϸ� 2���� �迭(��)
		
		for(int i = 0; i < rLength; i++) { 
			for(int j = 0; j < cLength; j++) {
				arrIncome[i][j] = Integer.parseInt(JOptionPane.showInputDialog(arrName[i][j] +" "+ inputMsg));
				arAgeSum[i] += arrIncome[i][j];
				arBranSum[j] += arrIncome[i][j];
				sum += arrIncome[i][j];
								
			}
		}
		
		for(int  i = 0; i < arAgeSum.length; i++) { //Strimg.format�� ���ڿ��� ������ �����ְ�; �� %.2f��������ٰ�!
			arAgeAvg[i] = Double.parseDouble(String.format("%.2f", (double)arAgeSum[i] / arBranSum.length));			
		}
		
		for(int  i = 0; i < arBranSum.length; i++) { //���� -> �Ǽ� -> ���ڿ� -> �Ǽ�
			arBranAvg[i] = Double.parseDouble(String.format("%.2f", (double)arBranSum[i] / arAgeSum.length));			
		}
		
		avg = Double.parseDouble(String.format("%.2f", (double)sum / (rLength * cLength)));
		
		for(int i = 0; i < rLength; i++) { 
			for(int j = 0; j < cLength; j++) { 
				result += arrName[i][j] + "����� :" + arrIncome[i][j] + "����\n"; 
			}
			result += arAgeName[i] + " �� ����� : " + arAgeSum[i] + "����\n";
			result += arAgeName[i] + " ��� ����� : " + arAgeAvg[i] + "����\n";
		}
		
		for(int i  = 0; i < arBranSum.length; i++) {
			result += arBranName[i] + " �� ����� : " + arBranSum[i] + "����\n";
			result += arBranName[i] + " ��� ����� : " + arBranAvg[i] + "����\n";
		}
		
		result += "�� ����� : " + sum + "����\n";
		result += "��� ����� : " + avg + "����\n";
		
		JOptionPane.showMessageDialog(null, result);
	}
}
