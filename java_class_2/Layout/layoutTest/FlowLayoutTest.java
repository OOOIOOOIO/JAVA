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
	JLabel label4 = new JLabel("쿠쿠쿠궁");
	
	
	public FlowLayoutTest() {
		setTitle("FlowLayoutTest"); // 플로우 레이아웃 컨테이너만듬
		setBounds(122, 200, 300, 400); 
		
		FlowLayout flow = new FlowLayout(); 
		setLayout(flow); 
		
		
		//Dimension d1 = new Dimension(this.getWidth(), 200); // 보더레이아웃
		
		label1.setBackground(Color.PINK); // 배경
		label1.setForeground(Color.RED); // 이름
		label1.setAlignment(Label.RIGHT); // 정렬
		Font font = new Font("Serif", Font.BOLD, 30);
		label1.setFont(font);
		//label1.setPreferredSize(d1); // border 반 꽉차게
		//add(label1, BorderLayout.SOUTH); // border
		add(label1); // -> flow
		
		label2.setBackground(Color.BLUE);
		label2.setForeground(Color.YELLOW);
		label2.setAlignment(Label.CENTER);
		label2.setFont(new Font("Monospaced", Font.ITALIC, 20));
		//label2.setPreferredSize(d1); // border 반 꽉차게
		//add(label2, BorderLayout.SOUTH); // border
		add(label2, FlowLayout.CENTER); // -> flow
		
		// FlowLayout은 옆으로 나열할 때
		// BorderLayout은 구역을 나눌 떄
		
		label3.setBackground(Color.ORANGE);
		label3.setForeground(Color.MAGENTA);
		label3.setAlignment(Label.LEFT);
		label3.setFont(new Font("DialogInput", Font.PLAIN, 40));
		add(label3);
		
		label4.setOpaque(true); // JLable은 opaque로 배경을 보이게 해줘야됨
		
		label4.setBackground(Color.BLACK);
		label4.setForeground(Color.WHITE);
		label4.setPreferredSize(new Dimension(200, 100));
		label4.setHorizontalAlignment(JLabel.CENTER); // 텍스트 수평정렬
		label4.setVerticalAlignment(JLabel.TOP); // 텍스트 수직 정렬
		label4.setFont(new Font("궁서체", Font.BOLD, 30));
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


