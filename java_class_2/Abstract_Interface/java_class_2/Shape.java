package java_class_2;

public abstract class Shape {
	double area;
	public abstract void draw(double weight, double height);
	
	final static  void function() { // 재정의 못하게 막음
		System.out.println("추상 클래스의 일반 메서드 입니다.");
		
	}
}



class Rect extends Shape{
	

	@Override
	public void draw(double weight, double height) {
		System.out.println("직사각형 점 4개 연결");
		area = weight * height;
		System.out.println("넓이 : " + area +"\n");
	}
	

}


class Tri extends Shape{
	
	@Override
	public void draw(double weight, double height) {
		System.out.println("삼각형 점 3개 연결");
		area = (weight * height) / 2;
		System.out.println("넓이 : " + area);
		
	}
}