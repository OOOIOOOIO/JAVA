package java_class;

//������, �����, ����
//�����ڸ� ����ؼ� �ʱ�ȭ �ϱ�
public class Animal_Class {
	String name;		// �ʵ�
	int age;
	String gender;
	double weight;
	String sound;
	String feed;
	
	public Animal_Class() {} // �����ε�
	
	public Animal_Class(String name, int age, String gender, double weight, String sound, String feed) {
		this.name = name;	
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.sound = sound;
		this.feed = feed;
	} 		// ���� ������ ������
	

	void getSound(){
		System.out.println(sound);
	}
	
	
	void eat() {
		System.out.println(name +"��(��)" + feed + "��(��) �Դ� ��." );
		
	}
	
	
	void sleep() {
		System.out.println(name + "��(��) �ڴ� ��.");
	}

	public static void main(String[] args) {
		Animal_Class dog = new Animal_Class("�ٹ�", 4, "����", 4.2, "�п�", "���");
		//Animal_Class cat = new Animal_Class("����", 5, "����", 5.1, "�̾߿�", "���");
		//Animal_Class pig = new Animal_Class("���Ȱ�", 37, "����", 128.7, "���¾� ���Ȱ�", "���");
		
		dog.eat();
		System.out.println(dog.name);
		
		
	}

}
