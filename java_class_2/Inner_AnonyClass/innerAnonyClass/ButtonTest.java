package innerAnonyClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ButtonTest extends Frame{
	
	public ButtonTest() {
		super("익명 클래스 테스드"); // 슈퍼클래스 받아옴, (창의 타이틀), ()가 있으면 생성자
		Button btn = new Button("눌러!"); // 버튼 만들기
		add(btn); // frame에 버튼을 추가하는 메서드
		setSize(500, 500); // 사이즈 정의
		
		addWindowListener(new WindowAdapter() { // 익명클래스
			@Override
			public void windowClosing(WindowEvent e) { // 웹 끄기
				
				System.out.println("프레임 종료");
				System.exit(0);
			}
		});
		
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) { // 클릭했을 때
				
				System.out.println(e.getX()); // x좌표 가져오기
				System.out.println(e.getY()); // y좌표 가져오기
				System.out.println("버튼 눌렀어요");
				
			}
		});
		
		setVisible(true); // 창 보이기
	}
	
	public static void main(String[] args) {
		new ButtonTest();
		
	}
}

