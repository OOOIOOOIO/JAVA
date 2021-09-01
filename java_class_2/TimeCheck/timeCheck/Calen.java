package timeCheck;

import java.util.Calendar;
import java.util.Scanner;

public class Calen {
	// 년 월 입력받고 달력 출력
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		
		int year = 0;
		int month = 0;
		
		do {
			System.out.println("보고싶은 달력의 년, 월을 입력하세요");
			year = sc.nextInt();
			month = sc.nextInt();
			if(year > 0 && month > 0 && month < 13) break;
			else System.out.println("다시 입력");
		}while(true);
		
		c.set(year, month-1, 1);
		int lastDay = c.getActualMaximum(c.DAY_OF_MONTH);
		int weekDay = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("    " + year + "년 " + month + "월");
		System.out.println("=======================");
		System.out.println("일   월   화   수   목   금   토");
		
		for (int i = 0; i < weekDay-1; i++) {
			if(i==0) System.out.print("    ");
			else System.out.print("     ");
		}
		
		for (int i = 1; i < lastDay+1; i++) {
			System.out.printf("%02d  ", i);
			if(weekDay % 7 == 0) {
				System.out.println();
			}
			weekDay++;
		}
		System.out.println("\n=======================");
		
	}
}
