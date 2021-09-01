package timeCheck;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TimeTest {
	
	public static void main(String[] args) {
		Date d = new Date();
		Calendar c = Calendar.getInstance(); // Calendar는 내부적으로 싱글턴 패턴임
		SimpleDateFormat sdf = new SimpleDateFormat("yyy.MM.dd(E) HH:mm:ss.SSS");
		String dOfWeek [] = {"일", "월", "화", "수", "목", "금", "토"};
		// Calendar 클래스는 singleton 패턴으로 설계된 클래스로
		// 객체를 만들어 사용할 수 없다. 그 이유는 내부에 자신의 클래스로 만든 객체를 포함하고 있기 때문이다.
		// 클래스 내부에 가지고 있는 자신의 객체를 얻어오는 메소드로 getInstance()를 사용한다.
		
		// singleton 패턴으로 설계하는 클래스는 프로그램에서 필요한 객체를 딱 1개만  사용한다.
		// Calendar의 DAY_OF_WEEK는 일요일 = 1, 월요일 = 2,.... 토요일 = 7 (외우기)
		// Calendar에서 지정되어 있는 함수로 월을 구할 때에는 1을 더해줘야한다. (월은 0부터 시작)
		System.out.println(d);
		System.out.println(c);
		System.out.println(sdf.format(c.getTime()));
		System.out.println("년 : " + c.get(Calendar.YEAR));
		System.out.println("월 : " + (c.get(Calendar.MONTH)+1));
		System.out.println("일 : " + c.get(Calendar.DATE));
		System.out.println("일 : " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일 : " + c.get(Calendar.DAY_OF_WEEK));
		System.out.println(dOfWeek[c.get(Calendar.DAY_OF_WEEK) -1] + "요일"); // 요일은 1부터 시작하므로 -1
		System.out.println("시 : " + c.get(Calendar.HOUR));
		System.out.println("시 : " + c.get(Calendar.HOUR_OF_DAY)); // 24시로 표기
		System.out.println("분 : " + c.get(Calendar.MINUTE));
		System.out.println("초 " + c.get(Calendar.SECOND));
		System.out.println("밀리초 " + c.get(Calendar.MILLISECOND));
		
		// Data 클래스는 1900을 기준으로 날짜를 처리한다.
		// 따라서 년을 얻으려면 199을 더해서 얻어와야하고, 넣어주려면 1900을 빼서 넣어줘야한다.
		// 월을 얻어오려면 1을 더해서 얻어와야 하고, 넣어주려면 1을 빼서 넣어야 한다.
		Scanner sc = new Scanner(System.in);
		System.out.println("년 월 일 : ");
		int year = sc.nextInt() - 1900;
		int month = sc.nextInt() - 1;
		int day= sc.nextInt();
		
		Date date = new Date(year, month, day);
		System.out.println(date);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy.MM.dd(E)");
		System.out.println(sdf2.format(date));
		
		
	}
	
}
