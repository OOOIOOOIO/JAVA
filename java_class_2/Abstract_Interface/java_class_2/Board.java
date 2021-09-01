package java_class_2;

public class Board {
	public static void main(String[] args) {
		new Rect().draw(10, 4);
		new Tri().draw(30, 3);
		
		Shape.function(); // 스태틱타입 메서드 접근하는 법
	}
}
	