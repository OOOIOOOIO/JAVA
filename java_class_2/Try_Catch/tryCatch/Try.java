package tryCatch;

public class Try {
	public static void main(String[] args) {
		
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) { //Exception e : 예외 다 잡음
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage()); // 예외 로그 기록해줌
			System.out.println("종료");
			
		}
		
	}
}


/*

			<예외처리>
에러 : 심각한 오류
예외 : 덜 심각한 오류

- 쓰는 법
1)
try{
	오류가 날 수도 있는 문장
}
catch(예외이름 객체명){
	오류 발생시 실행할 문장
}


2)
try{
	오류가 날 수도 있는 문장
}
catch(예외이름1 객체명1){
	오류 발생시 실행할 문장
}
catch(예외이름2 객체명2){
	오류 발생시 실행할 문장
}


3)
try{
	시도할 문장
}
catch(예외이름 객체명){
	오류 발생시 실행할 문장
}
finally{
	예외발생 여부에 상관없이 무조건 실행할 문장
}


4)
try{
	시도할 문장
}
catch(예외이름 1 | 예외이름2 객체명){
	둘 중 하나라도 발생시 시도할 문장
}


*/