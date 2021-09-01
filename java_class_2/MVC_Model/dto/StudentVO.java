package dto;

import dao.Student;

public class StudentVO implements Student{
	
	private String name; // 전역변수
	private int age;
	private int number;
	private static int seq; //학생 수
	
	public StudentVO() {} // 기본 생성자

	public StudentVO(String name, int age) { // 생성자를 호출할 때마다 초기화가 됨 그래서 seq를 static으로
		super();							 // 만들어서 학생 수를 보여줌
		this.name = name;
		this.age = age;
		this.number = ++seq;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumber() {
		return number;
	}
	
	
	public void show() {
		System.out.println("번호 :" +this.number + "  이름 :" + name + "  나이 :" + age+ "살");
	}
	
	
}
	
	
	
	
