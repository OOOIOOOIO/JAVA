package pb;

import javax.swing.JOptionPane;

public class Bakery {
	public static void main(String[] args) {
		BreadPlate bread = new BreadPlate();
		BreadMaker maker = new BreadMaker(bread);
		
		int choice = 0;
		String mian_option[] = {"���Ա�", "���� �� ���������� ��������"};
		
		maker.start();
		
		do {
			choice = JOptionPane.showOptionDialog(null, "bakery", "bakery",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, mian_option, null);
			
			if(choice == 0) {
				// ����� ���� �ִ� ���� �Ծ�����Ѵ�.
				maker.getBread().eatBread();
			}
			else {
				break;
			}
		}while(true);
	}
}
