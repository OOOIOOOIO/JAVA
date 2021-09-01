package java_class_2;

public class Arr_for {
	public static void main(String[] args) {
//		String [] arData = {"안녕", "반가워", "이름이", "뭐니"};
//		
//		for(String i : arData) { // 빠른 for문
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
		// 각 학생별 총점과 평균 출력하기 빠른 for문으로. 파이썬이랑 똑같지만 좀 더 포멀함
		
		for(int [] arScore : arrScore) { // 각 행을 arScore[]에 담아줌. 배열로 받는게 중요
			total = 0;
			cnt++;
			for(int score : arScore) { // 행의 각 요소들을 score에 넣어줌
				total += score;
			}
			System.out.println(cnt + "번 총점 : " + total + "점");
			avg = Double.parseDouble(String.format("%2f", (double)total / arScore.length));
			System.out.println(cnt + "번 평균 : " + avg + "점");
			
		}
	}
}
