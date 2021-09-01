package java_class;

import java.util.Scanner;

public class ArTask { // 호수들의 총 월세 및 평균 월세 구하기
	public static void main(String[] args) {
		int [] ho = new int[3];
		int sum = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < ho.length; i++) {
			System.out.println(i+1 + "월세를 입력하세요(단위 : 만원)");
			ho[i] = sc.nextInt();
			sum += ho[i];
			
		}
		System.out.println("1동 총 월세 :" + sum + "만원");
		avg = Double.parseDouble(String.format("%.2f", (double)sum / ho.length)); 
		// String.format은 클래스형태이고 String(포맷, 값) 형태임 (포맷 : %d %s %f...) 
		// 클래스 문자열형태이기 때문에 Double.parseDouble로 형변환 해준 것
		// System.out.printf("평균 월세 %.2f", avg); 처럼 출력 가능
		System.out.println("평균 월세 : " + avg + "만원");
		sc.close();
	}
}
