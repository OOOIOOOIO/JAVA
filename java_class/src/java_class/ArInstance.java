package java_class;

import java.util.Scanner;

class Animal{ // 클래스 만들 때 기본생성자, 생성자 만들기
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
		//정보를 보여줄거면 메서드를 만드는 게 아니라 toString으로 재정의 왜냐면 .toString()이 숨어있기 때문
			return "이름:" + name + "\n나이 : " + age +"살\n먹이 : " + feed;
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
		
		//arAni[i] = new Animal(); // 방을 매번 초기화 해줘야됨 그래야 힙메모리가 생김, 변수만 선언하고 초기화는 안한 꼴임
		System.out.println(i+1 + "번 동물 이름 : ");
		name = sc.next();
		//arAni[i].name = sc.next(); // 기본 생성자로 직접 접근해서 초기화 한거임
		System.out.println(" 나이 : ");
		arAni[i].name = sc.next(); // 기본 생성자로 직접 접근해서 초기화 한거임
		age = sc.nextInt();
		//arAni[i].age = sc.nextInt(); // 기본 생성자로 직접 접근해서 초기화 한 거임
		//System.out.println(arAni[i].name + " 먹이 : ");
		System.out.println(" 먹이 : ");
		feed = sc.next();
		//arAni[i].feed = sc.next(); // 기본 생성자로 직접 접근해서 초기화 한 거임
		arAni[i] = new Animal(name, age, feed); //초기화 해줌
	}
	
	for(int i = 0; i < arAni.length; i++) {
		System.out.println(arAni[i]);
	}
	sc.close();
	}
}

/*
	<클래스배열>
 객체를 여러개 선언해야 하는 경우
배열 타입으로 한번에 선언후 사용한다.

	<선언>
-클래스명[] 배열명 = new 클래스명[길이];
-클래스명[] 배열명 = {
				new 클래스명(),
				new 클래스명()
				};

	<사용>
배열명[index].변수명;
배열명[index].메서드명();
*/