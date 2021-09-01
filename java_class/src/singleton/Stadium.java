package singleton;

//import java.awt.Desktop;

public class Stadium {
	public static void main(String[] args) {
		//IronMan i = new IronMan(); //private으로 막아놈
		IronMan i = IronMan.getInstance(); // 받아오는 방법
		
		IronMan.fight(); // static이라서
		
		i.walk();
		
		//Desktop d = Desktop.getDesktop(); //싱클톤 패턴
	}
}
