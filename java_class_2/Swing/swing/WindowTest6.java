package swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class WindowTest6 extends Frame {
	public WindowTest6(){
		this("���� ���� ������");
	}
	
	public WindowTest6(String title) {
		
		setResizable(false); // â ũ�� ���� ���ϰ� ����
		
		setTitle(title);
		setSize(800, 500);
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dimen2 = getSize();
		int x = (dimen.width - dimen2.width) / 2;
		int y = (dimen.height - dimen2.height) / 2;
		
		
		setLocation(x, y);
		setBackground(new Color(new Random().nextInt(16581376)));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		new WindowTest6("������");
	}
}
