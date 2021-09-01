package java_class;

import java.util.Random;

class Person{
	String name;
	int age;
	String gender;
	int money;
	
	public Person() {} // �⺻ ������
	
	public Person(String name, int age, String gender, int money) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.money = money;
	} // �ʱ�ȭ�� ������ -> �̰� ����
		
}

class Teacher extends Person{
	int cnt;
	String subject;
	String position;
	private double income = 10_000_000.0;
	
	public Teacher() {} // �⺻ ������
	
	public Teacher(String name, int age, String gender, int money, String position) {
		super(name, age, gender, money);
		this.position = position;
	}
	
	void teach(String subject) {
		cnt++;
		if(cnt % 10 == 0) income *= 1.1;
		this.subject = subject;
		money += income;
		System.out.println(name + this.position + "��(��)" + this.subject + "��(��) ������");
		System.out.println("���� �ܰ�" + money + "��");
		
	}
	
}

class Student extends Person{
	int cnt;
	String subject;
	String position;
	private double income = 10_000_000.0;
	
	public Student() {} // �⺻ ������
	
	public Student(String name, int age, String gender, int money, String position) {
		super(name, age, gender, money);
		this.position = position;
	}
	
	void teach(String subject) {
		cnt++;
		if(cnt % 10 == 0) income *= 1.1;
		this.subject = subject;
		money += income;
		System.out.println(name + this.position + "��(��)" + this.subject + "��(��) ������");
		System.out.println("���� �ܰ�" + money + "��");
		
	}
	
}

public class Job_inh {
	
	public static void main(String[] args) {
		Teacher �輺ȣ = new Teacher("�輺ȣ", 20, "����", 0, "�л�"); //�ʱ�ȭ ����
		Student david = new Student("�輺ȣ", 20, "����", 0, "�л�"); //�ʱ�ȭ ����
		
		String[] arSub = {"JAVA", "PYTHON", "C"};
		
		david.age = 10;  
		
		System.out.println(david.age);
		Random r = new Random();
		int index = 0;
		index = r.nextInt(3); // 0~ 9������ ������ ��
		
		for(int i = 0; i < 100; i++) {
			�輺ȣ.teach(arSub[index]);
			try {
				Thread.sleep(500); // 0.5��				
			} 
			catch (Exception e) {

			}
		}
	}

}
