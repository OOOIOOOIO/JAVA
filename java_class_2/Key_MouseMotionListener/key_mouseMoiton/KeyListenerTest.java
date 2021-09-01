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
				System.out.println("키보드 타이핑할 때");
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("키보드에서 손가락이 떨어질 때");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("키보드를 누르고 있을 때");
				
				switch(e.getKeyCode()) {
				case KeyEvent.VK_LEFT : case KeyEvent.VK_A :
					System.out.println("캐릭터 왼쪽으로 이동");
					break;
					
				case KeyEvent.VK_RIGHT : case KeyEvent.VK_D :
					System.out.println("캐릭터 오른쪽으로 이동");
					break;
					
				case KeyEvent.VK_UP : case KeyEvent.VK_W :
					System.out.println("캐릭터 위쪽으로 이동");
					break;
					
				case KeyEvent.VK_DOWN : case KeyEvent.VK_S :
					System.out.println("캐릭터 아래쪽으로 이동");
					break;
					
				case KeyEvent.VK_SPACE :
					System.out.println("캐릭터 점프");
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
 					
 keyTyped() : 키보드에서 타이핑할 때
 keyReleased() : 키보드에서 손가락이 떨어질 때
 keyPressed() : 키보드를 누르고 있을 때
 getKeyText(getKeyCode()) : KetCode에 해당되는 키보드 위에 써있는 문자열을 얻어온다.
 
 */
