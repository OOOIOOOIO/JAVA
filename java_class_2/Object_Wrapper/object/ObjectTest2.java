package object;

public class ObjectTest2 {
	
	int data1 = 10;
	int data2 = 20;
	int data3 = 30;
	
	@Override
	public String toString() { // toString 재정의	
		 return ""+data1+data2+data3;
	}
	
	public ObjectTest2(int data1) { // 생성자
		this.data1 = data1;
	}
	
	public static void main(String[] args) {
		ObjectTest2 o = new ObjectTest2(90); // data1 = 90
		char[] word = {'안', '녕'};
		System.out.println(o); // 클래스 타입은 .toString()메서드가 숨어있음
		System.out.println(word);
		System.out.println(word.length);
		
		// 객체명을 출력할 때 항상 뒤에 toString()이 있는데 생략되어 있다
		// 원래 객체명에는 주소값이 들어있는데  내가 원하는 값을 toString()에서
		// 재정의를 해주면 간편하게 이용할 수 있다.
	}
}
