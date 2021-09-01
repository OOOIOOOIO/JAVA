package layoutTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;

public class FlowLayoutTest extends Frame {
	Label label1 = new Label("DOG");
	Label label2 = new Label("CAT");
	Label label3 = new Label("GAGA");
	JLabel label4 = new JLabel("�������");
	
	
	public FlowLayoutTest() {
		setTitle("FlowLayoutTest"); // �÷ο� ���̾ƿ� �����̳ʸ���
		setBounds(122, 200, 300, 400); 
		
		FlowLayout flow = new FlowLayout(); 
		setLayout(flow); 
		
		
		//Dimension d1 = new Dimension(this.getWidth(), 200); // �������̾ƿ�
		
		label1.setBackground(Color.PINK); // ���
		label1.setForeground(Color.RED); // �̸�
		label1.setAlignment(Label.RIGHT); // ����
		Font font = new Font("Serif", Font.BOLD, 30);
		label1.setFont(font);
		//label1.setPreferredSize(d1); // border �� ������
		//add(label1, BorderLayout.SOUTH); // border
		add(label1); // -> flow
		
		label2.setBackground(Color.BLUE);
		label2.setForeground(Color.YELLOW);
		label2.setAlignment(Label.CENTER);
		label2.setFont(new Font("Monospaced", Font.ITALIC, 20));
		//label2.setPreferredSize(d1); // border �� ������
		//add(label2, BorderLayout.SOUTH); // border
		add(label2, FlowLayout.CENTER); // -> flow
		
		// FlowLayout�� ������ ������ ��
		// BorderLayout�� ������ ���� ��
		
		label3.setBackground(Color.ORANGE);
		label3.setForeground(Color.MAGENTA);
		label3.setAlignment(Label.LEFT);
		label3.setFont(new Font("DialogInput", Font.PLAIN, 40));
		add(label3);
		
		label4.setOpaque(true); // JLable�� opaque�� ����� ���̰� ����ߵ�
		
		label4.setBackground(Color.BLACK);
		label4.setForeground(Color.WHITE);
		label4.setPreferredSize(new Dimension(200, 100));
		label4.setHorizontalAlignment(JLabel.CENTER); // �ؽ�Ʈ ��������
		label4.setVerticalAlignment(JLabel.TOP); // �ؽ�Ʈ ���� ����
		label4.setFont(new Font("�ü�ü", Font.BOLD, 30));
		add(label4);
		
		
		
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutTest();
	}
	
}


