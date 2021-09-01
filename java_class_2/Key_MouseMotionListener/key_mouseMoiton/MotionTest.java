package key_mouseMoiton;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MotionTest extends Panel{ // Jpanel은 흔적이 남아서 그림판처럼 쓸 수 있음
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
 					
 mouseMoved() : 지정된 영역에서 마우스를 움직일 떄
 mouseDragged() : 지정된 영역에서 마우스를 드래그할 때
 
addMouseMotionListener(new MouseAdapter(){});
MouseMotionListen를 JFrame에 걸어준다.
 
 					<KeyListener>
 					
 keyTyped() : 키보드에서 타이핑할 때
 keyReleased() : 키보드에서 손가락이 떨어질 때
 keyPressed() : 키보드를 누르고 있을 때
 getKeyText(getKeyCode()) : KetCode에 해당되는 키보드 위에 써있는 문자열을 얻어온다.
 
 */
