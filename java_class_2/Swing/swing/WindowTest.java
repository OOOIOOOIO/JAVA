package swing;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class WindowTest {
	public static void main(String[] args) {
		Frame window = new Frame();
		window.setTitle("������ ����� ������");
		window.setBounds(1200, 200, 400, 300);
		window.setBackground(Color.orange);
		// ������ 0~255���� 3���� �ִ�. �׷��Ƿ� ��� ����� ���� ���� ���� �������� ���´�.
		window.setBackground(new Color(new Random().nextInt(16_581_376)));
		
		window.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				window.dispose();
			}
		});
		
		window.setVisible(true);
	}
}
