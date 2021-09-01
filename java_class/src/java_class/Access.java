 package java_class;

public class Access {
	int data = 10;
	public int data2 = 20;
	protected int data3 = 30;
	private int data4 = 40;
	
	
	
	void f() {
				// 하지만 이것들 모두 main에서는 못 씀
		//data //ctrl + sapce 했을 떄 파란색 세모 : default(기본) -> 같은 패키지 안에서 다른 클래스에서 사용 가는
		//data2 // 초록색 동그라미 : public -> 패키지가 달라도 하나의 프로젝트 안에 있다면 모두 접근 가능
										// 또한 메인 클래스만 public 가능
		//data3 //노란색 동그라미 : protected -> 같은 패키지 안에서 다른 클래스에서 사용 가능
		//data4 //빨간색 네모 : private -> 선언된 영역에서만 접근 가능	
		
	}


	public int getData4() { // alt + shift + s -> r : 겟터 셋터 가져올 수있음
		return data4; 		//데이터 가져오기
	}


	public void setData4(int data4) {
		this.data4 = data4; //데이터 변경하기
	}
}

class Cloud{
	
	void function() {
		// Access a = new Access();
		 
		 
	}
	
}
