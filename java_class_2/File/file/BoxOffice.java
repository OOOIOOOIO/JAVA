package file;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class BoxOffice extends JFrame implements ActionListener {
	
	TextArea box = new TextArea(BoxOfficeView.getContents());
	TextArea search = new TextArea("검색 : Ctrl, 삭제 : 버튼 클릭");
	
	
	public BoxOffice() {
		JScrollPane scroll = new JScrollPane();
		JButton btn = new JButton("삭제");
		setTitle("BoxOffice");
		setBounds(1000, 500, 600, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn.setFont(new Font("D2Coding", Font.BOLD, 40));
		btn.addActionListener(this);
		
		box.setEditable(false);
		scroll.setViewportView(box);
		getContentPane().add(scroll);
		add(search, BorderLayout.NORTH);
		add(box, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
