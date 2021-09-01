package java_class;

//강아지, 고양이, 돼지
//생성자를 사용해서 초기화 하기
public class Animal_Class {
	String name;		// 필드
	int age;
	String gender;
	double weight;
	String sound;
	String feed;
	
	public Animal_Class() {} // 오버로딩
	
	public Animal_Class(String name, int age, String gender, double weight, String sound, String feed) {
		this.name = name;	
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.sound = sound;
		this.feed = feed;
	} 		// 따로 선언한 생성자
	

	void getSound(){
		System.out.println(sound);
	}
	
	
	void eat() {
		System.out.println(name +"이(가)" + feed + "을(를) 먹는 중." );
		
	}
	
	
	void sleep() {
		System.out.println(name + "이(가) 자는 중.");
	}

	public static void main(String[] args) {
		Animal_Class dog = new Animal_Class("꾸미", 4, "여자", 4.2, "왈왈", "사료");
		//Animal_Class cat = new Animal_Class("봄이", 5, "여자", 5.1, "미야옹", "사료");
		//Animal_Class pig = new Animal_Class("저팔계", 37, "남자", 128.7, "나는야 저팔계", "고기");
		
		dog.eat();
		System.out.println(dog.name);
		
		
	}

}
