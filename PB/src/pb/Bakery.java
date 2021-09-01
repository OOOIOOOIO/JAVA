package pb;

import javax.swing.JOptionPane;

public class Bakery {
	public static void main(String[] args) {
		BreadPlate bread = new BreadPlate();
		BreadMaker maker = new BreadMaker(bread);
		
		int choice = 0;
		String mian_option[] = {"»§¸Ô±â", "»§ÀÌ ´Ù ¶³¾îÁ³À¸¸é ´©¸£¼¼¿ä"};
		
		maker.start();
		
		do {
			choice = JOptionPane.showOptionDialog(null, "bakery", "bakery",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, mian_option, null);
			
			if(choice == 0) {
				// ¸¸µå´Â °÷¿¡ ÀÖ´Â »§À» ¸Ô¾îÁà¾ßÇÑ´Ù.
				maker.getBread().eatBread();
			}
			else {
				break;
			}
		}while(true);
	}
}
