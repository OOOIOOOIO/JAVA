package swing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class WindowTest3 {
	public static void main(String[] args) {
		JFrame window = new JFrame("제목 있는 윈도우");
		window.setBounds(1200 ,200, 400, 300);
		
		Container con = window.getContentPane();
		con.setBackground(Color.black);
	
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
