package object;

public class Wrapper {
	public static void main(String[] args) {
		
	
	// jdk 1.5 이하 버전에서는 무조건 이렇게 사용해야 했다.
	String str = new String("10"); // 박싱
	
	// jdk 1.5 이휴 (박싱 = 랩핑)
	String str2 = "20"; // 오토 박싱
	Integer data = 10; // 오토 박싱 / Wrapper클래스로 값을 넣으면 오토 박싱
	int data2 = data; // 오토 언박싱 / 일반타입에 클래스타입인 것을 넣으면 언박싱
	
	System.out.println(str + str2);
	}
}

/*
			<Wrapper 클래스>
 기본형 타입이 객체화할 수 있게 도와주는 클래스
  쓰는 이유 : 기본형 타입을 객채로 다뤄야 할 떄
  		   매개변수를 객체로 넘길 때
  		   기본형 타입이 아닌 객체로 저장해야할 때
  		   객체간의 비교가 필요할 때
  
 Wrapper클래스 -> 기본현 타입 : 박싱(Boxing)
 Wrapper클래스 <- 기본형 타입 : 언박생(Unboxing)
 Integer > int
 Double < double
 String
*/



