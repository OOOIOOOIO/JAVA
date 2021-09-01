package java_class;

import java.util.Scanner;

class Animal{ // Ŭ���� ���� �� �⺻������, ������ �����
	String name;
	int age;
	String feed;
	
	public Animal() {}
	
	public Animal(String name, int age, String feed) {
		this.name = name;
		this.age = age;
		this.feed = feed;
	}
	
	@Override
		public String toString() {
		//������ �����ٰŸ� �޼��带 ����� �� �ƴ϶� toString���� ������ �ֳĸ� .toString()�� �����ֱ� ����
			return "�̸�:" + name + "\n���� : " + age +"��\n���� : " + feed;
		}
	
	
}



public class ArInstance {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Animal[] arAni = new Animal[3];
	String name = "";
	int age = 0;
	String feed = ""; 
	
	for(int i = 0; i < arAni.length; i++) {
		
		//arAni[i] = new Animal(); // ���� �Ź� �ʱ�ȭ ����ߵ� �׷��� ���޸𸮰� ����, ������ �����ϰ� �ʱ�ȭ�� ���� ����
		System.out.println(i+1 + "�� ���� �̸� : ");
		name = sc.next();
		//arAni[i].name = sc.next(); // �⺻ �����ڷ� ���� �����ؼ� �ʱ�ȭ �Ѱ���
		System.out.println(" ���� : ");
		arAni[i].name = sc.next(); // �⺻ �����ڷ� ���� �����ؼ� �ʱ�ȭ �Ѱ���
		age = sc.nextInt();
		//arAni[i].age = sc.nextInt(); // �⺻ �����ڷ� ���� �����ؼ� �ʱ�ȭ �� ����
		//System.out.println(arAni[i].name + " ���� : ");
		System.out.println(" ���� : ");
		feed = sc.next();
		//arAni[i].feed = sc.next(); // �⺻ �����ڷ� ���� �����ؼ� �ʱ�ȭ �� ����
		arAni[i] = new Animal(name, age, feed); //�ʱ�ȭ ����
	}
	
	for(int i = 0; i < arAni.length; i++) {
		System.out.println(arAni[i]);
	}
	sc.close();
	}
}

/*
	<Ŭ�����迭>
 ��ü�� ������ �����ؾ� �ϴ� ���
�迭 Ÿ������ �ѹ��� ������ ����Ѵ�.

	<����>
-Ŭ������[] �迭�� = new Ŭ������[����];
-Ŭ������[] �迭�� = {
				new Ŭ������(),
				new Ŭ������()
				};

	<���>
�迭��[index].������;
�迭��[index].�޼����();
*/