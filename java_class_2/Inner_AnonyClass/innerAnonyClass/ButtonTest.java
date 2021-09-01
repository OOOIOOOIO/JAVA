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
		super("�͸� Ŭ���� �׽���"); // ����Ŭ���� �޾ƿ�, (â�� Ÿ��Ʋ), ()�� ������ ������
		Button btn = new Button("����!"); // ��ư �����
		add(btn); // frame�� ��ư�� �߰��ϴ� �޼���
		setSize(500, 500); // ������ ����
		
		addWindowListener(new WindowAdapter() { // �͸�Ŭ����
			@Override
			public void windowClosing(WindowEvent e) { // �� ����
				
				System.out.println("������ ����");
				System.exit(0);
			}
		});
		
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) { // Ŭ������ ��
				
				System.out.println(e.getX()); // x��ǥ ��������
				System.out.println(e.getY()); // y��ǥ ��������
				System.out.println("��ư �������");
				
			}
		});
		
		setVisible(true); // â ���̱�
	}
	
	public static void main(String[] args) {
		new ButtonTest();
		
	}
}

