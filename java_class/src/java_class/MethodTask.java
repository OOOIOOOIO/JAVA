package java_class;
/*
 * 홀수를 짝수로, 짝수를 홍수로 바꿔주는 메서드
 * 1부터 내가 입력한 정수까지의 누적합을 구해주는 메서드
 * 두 정수의 나눗셈 메서드
 * 
 * 정수를 한글로 바꿔주는 메서드
 * 예 1024 -> 일공이사
 */
public class MethodTask {
	
	void change(int input) { // 입력받은 짝수를 홀수로, 홀수를 짝수로
		if(input / 2 == 0) {
			System.out.println(input-1);
		}
		else if(input / 2 != 0) {
			System.out.println(input+1);
		}
	}
	
	
	void total(int end){ //1부터 내가 입력한 수까지의 합
		int result = 0;
		
		if(end > 1) {
			for(int i = 1; i < end+1; i++) {
				result += i;
				
			}
			System.out.println(result);
		}
		else {
			System.out.println("1보다 큰 수를 입력하세요");
		}
		
	}
	
	
	void div(int num1, int num2) { // 입력받은 두 수 나누기
		double result = 0.0;
		if(num1 != 0 && num2 != 0) {
			
			result = Double.parseDouble(String.format("%.3f", (double)num1 / num2));
			System.out.println(result);
		}
		else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
	
	
	void changeToHangle(String data){
		String hangle = "공일이삼사오육칠팔구";  //문자열은 배열처럼 생각하되 []가 없으므로 사용하는 법이 다르다
		String result = "";				  //문자열은 .charAt(index) / 배열은 [index]
		int num = Integer.parseInt(data); //문자열의 길이는 .length() / 배열은 length 왜냐하면 문자열은 String 클래스타입이기 때문
		
		for (int i = 0; i < data.length(); i++) { //클래스는 length()클래스로 접근해야됨
			result += hangle.charAt(num % 10);
			num /= 10; //charAT(index) == 배열의 []. 클래스라서 클래스로 써야됨
		}
		
		for(int i = data.length() -1; i > -1; i--) {
			System.out.println(result.charAt(i));
		}
	}
	
	
	
	
	public static void main(String[] args) {
		MethodTask m = new MethodTask();
		
		m.change(10);
		m.total(10);
		m.div(5, 5);
		m.changeToHangle("1024");
	}
}
