package java_class;

public abstract class Shape {
	double area;
	
	
	abstract void showArea(double w, double h); 
	//추상 메서드, 자식 클래스에서 재정의 필수
	
	
	final void function() { 
		// final : 상수 -> 자식클래스에서 재정의 불가, 사용만 가능
		System.out.println("추상 클래스의 일반 메서드입니다.");
	}
}	

class Ret extends Shape{ // abstract class를 상속 받아야됨
	
	@Override
	void showArea(double w, double h) {
		area = w*h;
		System.out.println("넓이 : " + area);
		
	}
	
}

class Tri extends Shape{ // abstract class를 상속 받아야됨
	
	@Override
	void showArea(double w, double h) {
		area = (w * h) / 2;
		System.out.println("넓이 : " + area);
	
	
	}
}
