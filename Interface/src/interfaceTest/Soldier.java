package interfaceTest;

public interface Soldier {
	int arms = 2; //final static이 생략되어 있음 : 외부에서 수정 불가능하나다는 뜻
	final static int legs = 2;
	
	abstract void eat(); // 추상형 메서드
	void work();  // abstract가 생략되어 있음
	void play();
	void sleep();
	void salute();
}	
