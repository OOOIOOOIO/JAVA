package singleton;

//import java.awt.Desktop;

public class Stadium {
	public static void main(String[] args) {
		//IronMan i = new IronMan(); //private���� ���Ƴ�
		IronMan i = IronMan.getInstance(); // �޾ƿ��� ���
		
		IronMan.fight(); // static�̶�
		
		i.walk();
		
		//Desktop d = Desktop.getDesktop(); //��Ŭ�� ����
	}
}
