package key_mouseMoiton;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;



public class KeyListenerTest extends JFrame{
	public KeyListenerTest() {
		setTitle("KeyListenerTest");
		setBounds(800, 100, 300, 400);
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("Ű���� Ÿ������ ��");
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("Ű���忡�� �հ����� ������ ��");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("Ű���带 ������ ���� ��");
				
				switch(e.getKeyCode()) {
				case KeyEvent.VK_LEFT : case KeyEvent.VK_A :
					System.out.println("ĳ���� �������� �̵�");
					break;
					
				case KeyEvent.VK_RIGHT : case KeyEvent.VK_D :
					System.out.println("ĳ���� ���������� �̵�");
					break;
					
				case KeyEvent.VK_UP : case KeyEvent.VK_W :
					System.out.println("ĳ���� �������� �̵�");
					break;
					
				case KeyEvent.VK_DOWN : case KeyEvent.VK_S :
					System.out.println("ĳ���� �Ʒ������� �̵�");
					break;
					
				case KeyEvent.VK_SPACE :
					System.out.println("ĳ���� ����");
					break;
					
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
			new KeyListenerTest();
	}
}

/*
  					<KeyListener>
 					
 keyTyped() : Ű���忡�� Ÿ������ ��
 keyReleased() : Ű���忡�� �հ����� ������ ��
 keyPressed() : Ű���带 ������ ���� ��
 getKeyText(getKeyCode()) : KetCode�� �ش�Ǵ� Ű���� ���� ���ִ� ���ڿ��� ���´�.
 
 */
