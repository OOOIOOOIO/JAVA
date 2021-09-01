package swing;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class WindowTest2 extends Frame{
	
	public WindowTest2() {
		this("제목 없는 윈도우");
	}
	
	public WindowTest2(String title) { // main에서 넘겨주기
		setTitle(title);
		setBounds(1200, 400, 400, 300);
		setBackground(new Color(new Random().nextInt(16581376)));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowTest2();
		new WindowTest2("제목있는 윈도우");
		
	}
}
