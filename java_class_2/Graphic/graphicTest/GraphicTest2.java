package graphicTest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class GraphicTest2 extends Panel implements Runnable {
	int xpos = 50;
	int ypos = 50;
	Color color = new Color(new Random().nextInt(16581376));
	
	public static void main(String[] args) {
		Frame window = new Frame("GraphicTest2");
		window.setBounds(1000, 200, 500, 600);
		window.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				window.dispose();
			}
		});
	GraphicTest2 graphic = new GraphicTest2();
	window.add(graphic);
	window.setVisible(true);
	
	Thread thread = new Thread(graphic);
	thread.start();
	
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 500, 600);
		g.setColor(color);
		g.fillOval(xpos, ypos, 50, 50);
	}
	
	
	@Override
	public void run() {
		int x = 1;
		int y = 1;
		
		while(true) {
			xpos += x;
			ypos += y;
			if(xpos > 450 || xpos == 0) {
				x *= -1;
				color = new Color(new Random().nextInt(16581376));
			}
			
			if(ypos > 520 || ypos == 0) {
				y *= -1;
				color = new Color(new Random().nextInt(16581376));
				
			}
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			repaint();
		}
		
	}
}
