package key_mouseMoiton;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseMotionListenerTest extends JFrame {
	JPanel panel = new JPanel();
	
	public MouseMotionListenerTest() {
		setTitle("MouseMotionListenerTest");
		setBounds(1200, 200, 500, 400);
		panel.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("마우스 이동 : " + e.getPoint());
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println("마우스 드래기 : x = " + e.getX() + " , y = " + e.getY());
			}
		});
		
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MouseMotionListenerTest mouse = new MouseMotionListenerTest();
	}
}
