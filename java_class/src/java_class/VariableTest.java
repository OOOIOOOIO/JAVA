package java_class;

public class VariableTest {
	static int data = 0; 
	//static은 다시 초기화되지 않고 아래로 읽음
	//static도 전역변수임
	
	void f() {
		System.out.println(++data);
	}

	void f2() {
		data = 20;
	}
}
