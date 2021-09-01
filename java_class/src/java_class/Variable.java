package java_class;

public class Variable { //여기가 클래스

	public static void main(String[] args) {
		int i = 100;
		long l = 100L;
		double d1 = 1.23;
		float f = 1.24F;
		char c = 'A';
		String s = "김성호"; //String은 class 타입
		String num1 = "1";
		String num2 = "2";
		int num3 = 3;
		
//		System.out.println(i);
//		System.out.println(l);
//		System.out.println(d1);
//		System.out.println(f);
//		System.out.println(c);
//		System.out.println(s);
		//print와 println은 그대로 변수명을 넣으면 되지만
		//printf는 서식문자를 사용한다.""안에서 사용한다.
		System.out.printf("%d\n", i);
		System.out.printf("%d\n", l);
		System.out.printf("%f\n", d1);
		System.out.printf("%f\n", f);
		System.out.printf("%c\n", c);
		System.out.printf("%s\n", s);
		
		//강제 형변환 하는법
		
		System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
		//정수형을 문자열으로
		
		System.out.println("" + num3 + 9); 
		//정수형을 문자형으로. "" + ~~~들 다 문자로 바뀜
		
		
		//VariableTest에서 가져오기
		
		VariableTest vt = new VariableTest(); // 객체화
		vt.f();
		vt.f();
		vt.f();
		vt.f();
		vt.f();
		vt.f();
		vt.f();
		vt.f();
		vt.f2();
		vt = new VariableTest(); //new를 만난 순간 다시 읽으러 감
		vt.f();					// 하지만 data에 static을 해줘서 다시 안읽음 
		
		
	}

}
