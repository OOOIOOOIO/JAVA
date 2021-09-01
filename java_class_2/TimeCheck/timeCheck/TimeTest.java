package timeCheck;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TimeTest {
	
	public static void main(String[] args) {
		Date d = new Date();
		Calendar c = Calendar.getInstance(); // Calendar�� ���������� �̱��� ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyy.MM.dd(E) HH:mm:ss.SSS");
		String dOfWeek [] = {"��", "��", "ȭ", "��", "��", "��", "��"};
		// Calendar Ŭ������ singleton �������� ����� Ŭ������
		// ��ü�� ����� ����� �� ����. �� ������ ���ο� �ڽ��� Ŭ������ ���� ��ü�� �����ϰ� �ֱ� �����̴�.
		// Ŭ���� ���ο� ������ �ִ� �ڽ��� ��ü�� ������ �޼ҵ�� getInstance()�� ����Ѵ�.
		
		// singleton �������� �����ϴ� Ŭ������ ���α׷����� �ʿ��� ��ü�� �� 1����  ����Ѵ�.
		// Calendar�� DAY_OF_WEEK�� �Ͽ��� = 1, ������ = 2,.... ����� = 7 (�ܿ��)
		// Calendar���� �����Ǿ� �ִ� �Լ��� ���� ���� ������ 1�� ��������Ѵ�. (���� 0���� ����)
		System.out.println(d);
		System.out.println(c);
		System.out.println(sdf.format(c.getTime()));
		System.out.println("�� : " + c.get(Calendar.YEAR));
		System.out.println("�� : " + (c.get(Calendar.MONTH)+1));
		System.out.println("�� : " + c.get(Calendar.DATE));
		System.out.println("�� : " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("���� : " + c.get(Calendar.DAY_OF_WEEK));
		System.out.println(dOfWeek[c.get(Calendar.DAY_OF_WEEK) -1] + "����"); // ������ 1���� �����ϹǷ� -1
		System.out.println("�� : " + c.get(Calendar.HOUR));
		System.out.println("�� : " + c.get(Calendar.HOUR_OF_DAY)); // 24�÷� ǥ��
		System.out.println("�� : " + c.get(Calendar.MINUTE));
		System.out.println("�� " + c.get(Calendar.SECOND));
		System.out.println("�и��� " + c.get(Calendar.MILLISECOND));
		
		// Data Ŭ������ 1900�� �������� ��¥�� ó���Ѵ�.
		// ���� ���� �������� 199�� ���ؼ� ���;��ϰ�, �־��ַ��� 1900�� ���� �־�����Ѵ�.
		// ���� �������� 1�� ���ؼ� ���;� �ϰ�, �־��ַ��� 1�� ���� �־�� �Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �� �� : ");
		int year = sc.nextInt() - 1900;
		int month = sc.nextInt() - 1;
		int day= sc.nextInt();
		
		Date date = new Date(year, month, day);
		System.out.println(date);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy.MM.dd(E)");
		System.out.println(sdf2.format(date));
		
		
	}
	
}
