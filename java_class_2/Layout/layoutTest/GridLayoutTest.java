package layoutTest;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class GridLayoutTest extends Frame{
	
	
	Button[] arButton = new Button[16];
	String [] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
			"13", "14", "15", "16"};
	
	public GridLayoutTest() {
		setTitle("GridLayoutTest"); // �׸��� ���̾ƿ� �����̳ʸ���
		setBounds(1200, 200, 400, 400);;
		setBackground(Color.GRAY);
		
		GridLayout grid = new GridLayout(4, 4, 3, 3);
		setLayout(grid); 
		
		for (int i = 0; i < 100; i++) {
			int r = new Random().nextInt(15)+1;
			String s = number[0];
			number[0] = number[r];
			number[r] = s;
		}
		
		
		
		for (int i = 0; i < arButton.length; i++) {
			arButton[i] = new Button(number[i]); // �̷��� �־���
			arButton[i].setName(""+(i+1)); // �ָ� ����� getName�� ��
			arButton[i].setFont(new Font("Dialog", Font.BOLD, 20));
			add(arButton[i]);
			
			if(arButton[i].getName().equals("3")) {
				arButton[i].setEnabled(false); // Ŭ�� �ȵǰ�
			}
			else if(arButton[i].getActionCommand().equals("16")) { // ���� ��
				arButton[i].setVisible(false); // �Ⱥ��̰�
			}
		
		}
		
		addWindowListener(new WindowAdapter() { // xâ �����
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new GridLayoutTest();
	}
}
