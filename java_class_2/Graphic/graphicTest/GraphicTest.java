package graphicTest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicTest extends Panel{
	
	public static void main(String[] args) {
		Frame window = new Frame("GraphicTest");
		window.setBounds(700, 50, 500, 600);
		window.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				window.dispose();
			}
		});
		GraphicTest graphic = new GraphicTest();
		window.add(graphic);
		window.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString("문자열 그리기", 100, 50);
		g.setColor(Color.RED); // 먼저 색을 설정해야됨
		g.drawLine(100, 100, 200, 200);
		g.setColor(Color.BLUE);
		g.drawOval(100, 100, 100, 100); // 원
		g.setColor(Color.MAGENTA);
		g.fillRect(250, 100, 100, 100);
		g.setColor(new Color(0, 255, 0, 125));
		g.fillOval(300, 100, 100, 100);
	}
}
