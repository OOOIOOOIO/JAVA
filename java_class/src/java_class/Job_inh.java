package java_class;

import java.util.Random;

class Person{
	String name;
	int age;
	String gender;
	int money;
	
	public Person() {} // 기본 생성자
	
	public Person(String name, int age, String gender, int money) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.money = money;
	} // 초기화한 생성자 -> 이게 쓰임
		
}

class Teacher extends Person{
	int cnt;
	String subject;
	String position;
	private double income = 10_000_000.0;
	
	public Teacher() {} // 기본 생성자
	
	public Teacher(String name, int age, String gender, int money, String position) {
		super(name, age, gender, money);
		this.position = position;
	}
	
	void teach(String subject) {
		cnt++;
		if(cnt % 10 == 0) income *= 1.1;
		this.subject = subject;
		money += income;
		System.out.println(name + this.position + "이(가)" + this.subject + "을(를) 강의중");
		System.out.println("통장 잔고" + money + "원");
		
	}
	
}

class Student extends Person{
	int cnt;
	String subject;
	String position;
	private double income = 10_000_000.0;
	
	public Student() {} // 기본 생성자
	
	public Student(String name, int age, String gender, int money, String position) {
		super(name, age, gender, money);
		this.position = position;
	}
	
	void teach(String subject) {
		cnt++;
		if(cnt % 10 == 0) income *= 1.1;
		this.subject = subject;
		money += income;
		System.out.println(name + this.position + "이(가)" + this.subject + "을(를) 강의중");
		System.out.println("통장 잔고" + money + "원");
		
	}
	
}

public class Job_inh {
	
	public static void main(String[] args) {
		Teacher 김성호 = new Teacher("김성호", 20, "남자", 0, "학생"); //초기화 해줌
		Student david = new Student("김성호", 20, "남자", 0, "학생"); //초기화 해줌
		
		String[] arSub = {"JAVA", "PYTHON", "C"};
		
		david.age = 10;  
		
		System.out.println(david.age);
		Random r = new Random();
		int index = 0;
		index = r.nextInt(3); // 0~ 9까지의 랜덤한 수
		
		for(int i = 0; i < 100; i++) {
			김성호.teach(arSub[index]);
			try {
				Thread.sleep(500); // 0.5초				
			} 
			catch (Exception e) {

			}
		}
	}

}
