package java_class;

public class Board_Shape {
	public static void main(String[] args) {
		Ret re = new Ret();
		re.showArea(10,50);
		
		//new Ret().showArea(10, 50); // 객체 만들지 않고
		new Tri().showArea(30, 13); // 생성자로 바로 사용하기
	}
}
