package key_mouseMoiton;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MotionTest extends Panel{ // Jpanel�� ������ ���Ƽ� �׸���ó�� �� �� ����
	static int x = 50;
	static int y = 50;
	
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setTitle("MotionTest");
		window.setBounds(1200, 200, 500, 6400);
		MotionTest graphic = new MotionTest();
		
		graphic.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				x = e.getX()-15;
				y = e.getY()-15;
				graphic.repaint();
			}
		});
		
		window.add(graphic);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(x, y, 30, 30);
	}
}

/*
 					<MouseMotinoListener>
 					
 mouseMoved() : ������ �������� ���콺�� ������ ��
 mouseDragged() : ������ �������� ���콺�� �巡���� ��
 
addMouseMotionListener(new MouseAdapter(){});
MouseMotionListen�� JFrame�� �ɾ��ش�.
 
 					<KeyListener>
 					
 keyTyped() : Ű���忡�� Ÿ������ ��
 keyReleased() : Ű���忡�� �հ����� ������ ��
 keyPressed() : Ű���带 ������ ���� ��
 getKeyText(getKeyCode()) : KetCode�� �ش�Ǵ� Ű���� ���� ���ִ� ���ڿ��� ���´�.
 
 */
