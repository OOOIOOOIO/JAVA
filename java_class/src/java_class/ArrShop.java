package java_class;

import javax.swing.JOptionPane;

public class ArrShop {
	public static void main(String[] args) {
		int sum = 0;
		double avg = 0.0;
		
		int[][] arrIncome = new int[2][3]; // 지점의 개수
		int[] arAgeSum = new int[2]; // 성인, 아동
		int[] arBranSum = new int[3]; // 지역의 개수
		double[] arAgeAvg = new double[2]; // 성인, 아동 
		double[] arBranAvg = new double[3]; // 지역의 개수
		
		String inputMsg = "매출액을 입력하세요.";
		String result = "";
		
		String[][] arrName = {
				{"강남점A", "홍대점A", "신촌점A"},
				{"강남점K", "홍대점K", "신촌점K"}
		};
		
		String[] arAgeName = {"성인", "키즈"};
		String[] arBranName = {"강남점", "홍대점", "신촌점"};
		
		int rLength = arrIncome.length; // 접근하기 전엔 그냥 1차원 배열(행)
		int cLength = arrIncome[0].length; // 접근하면 2차원 배열(열)
		
		for(int i = 0; i < rLength; i++) { 
			for(int j = 0; j < cLength; j++) {
				arrIncome[i][j] = Integer.parseInt(JOptionPane.showInputDialog(arrName[i][j] +" "+ inputMsg));
				arAgeSum[i] += arrIncome[i][j];
				arBranSum[j] += arrIncome[i][j];
				sum += arrIncome[i][j];
								
			}
		}
		
		for(int  i = 0; i < arAgeSum.length; i++) { //Strimg.format은 문자열의 형식을 정해주고싶어서 씀 %.2f형식으루다가!
			arAgeAvg[i] = Double.parseDouble(String.format("%.2f", (double)arAgeSum[i] / arBranSum.length));			
		}
		
		for(int  i = 0; i < arBranSum.length; i++) { //정수 -> 실수 -> 문자열 -> 실수
			arBranAvg[i] = Double.parseDouble(String.format("%.2f", (double)arBranSum[i] / arAgeSum.length));			
		}
		
		avg = Double.parseDouble(String.format("%.2f", (double)sum / (rLength * cLength)));
		
		for(int i = 0; i < rLength; i++) { 
			for(int j = 0; j < cLength; j++) { 
				result += arrName[i][j] + "매출액 :" + arrIncome[i][j] + "만원\n"; 
			}
			result += arAgeName[i] + " 총 매출액 : " + arAgeSum[i] + "만원\n";
			result += arAgeName[i] + " 평균 매출액 : " + arAgeAvg[i] + "만원\n";
		}
		
		for(int i  = 0; i < arBranSum.length; i++) {
			result += arBranName[i] + " 총 매출액 : " + arBranSum[i] + "만원\n";
			result += arBranName[i] + " 평균 매출액 : " + arBranAvg[i] + "만원\n";
		}
		
		result += "총 매출액 : " + sum + "만원\n";
		result += "평균 매출액 : " + avg + "만원\n";
		
		JOptionPane.showMessageDialog(null, result);
	}
}
