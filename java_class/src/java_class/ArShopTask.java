package java_class;

import java.util.Scanner;

public class ArShopTask {
	public static void main(String[] args) {
		int[] arIncome = new int[3];
		String[] arName = {"강남점", "코엑스점", "명동점"};
		int sum = 0;
		int cnt = 0;
		double avg = 0.0;
		String best = "없음";
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arIncome.length; i++) {
			System.out.println(arName[i] + " 매출액을 입력하세요(단위 : 백만원)");
			arIncome[i] = sc.nextInt();
			sum += arIncome[i];
			
		}
		avg = Double.parseDouble(String.format("%.2f", (double)sum / arIncome.length));
		System.out.println("ZARA 총 매출액 : " + sum + "백만원");
		System.out.println("평균 매출액 : " + avg + "만원");
		
		for (int i = 0; i < arName.length; i++) {
			if(arIncome[i] > avg) {
				cnt++;
				if(cnt ==1) best = "";
				best += arName[i]+ "\n";
			}
		}
			
		System.out.println("★인센티브 매장★\n" + best);
		sc.close();
	}
}