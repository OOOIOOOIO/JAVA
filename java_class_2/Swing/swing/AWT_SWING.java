package swing;

public class AWT_SWING {

}
/*
				<AWT>
 �ü���� Ư¡�� ���� ȭ���� �����Ѵ�.
 (�ü������ �ٸ� �������� �����ȴ�.)
 
 				<SWING>
 �ڹٿ��� �����Ǵ� look&feel�� �����Ͽ� ��� �ü������
 �����ϰ� ������
 
 Container : â�� �����̳ʶ�� ��. �ݵ�� �� �� �̻��� �����ϸ�, �����̳� ���� ������Ʈ�� �ö󰣴�.
 			Frame, Panel, Window ( AWT)
 			JFrame, JPanel ( swing)
 
 Component : ������ �����̳� ���� �ö� �� ȭ�� ������ ����ϴ� �͵�.
 			Button, TextField, TextArea, ...
 			JButton, Label, ...
 
 LayoutManagerf : �����̳� ���� ������Ʈ�� �ø� �� ��ġ ũ�� ���� �����ϴ� �͵�
 				 BorderLayout, GridLayout
 
 Frame Ŭ���� ��ü�� �����ؼ� ������ �����
 
 Frame window = new Frame(); --> ������� ������ �����.
 Frame window = new Frame(����); --> �����ִ� ������ �����.
 
 window.setTitle("���ο� ����"); --> ������ ������ ����
 window.setSize(width, height); --> �������� ũ�⸦ ����
 window.setLocation(x, y); --> �������� ��ġ�� ����
 window.setBounds(x, y, width, height); --> �������� ũ��� ��ġ�� �����Ѵ�.
 window.setBackground(bgcolor); --> �������� ������ ���� 
 
 	Frame Ŭ������ ����ؼ� ������ ������ �ݱ�
 	
 ������ �ݱ� ��ư�� Ŭ���ϸ� �ڵ����� ����Ǵ�
 windowClosing()�޼ҵ带 override�ؼ� �����츦
 �ݴ� �ڵ带 �־��ش�.
 
 System.exit(0); --> ���α׷���  ������ ����. ��� �����찡 ���� 
 Window.dispose(); --> �����찡 ����ϴ� �ڿ��� �ý��ۿ��� �ݳ��Ѵ�. ���� ������(�� ��ü)�� �ݴ´�
 Window.setVisible(true); --> �����츦 ȭ�鿡 ǥ���Ѵ�.
 
 
 Dimension : ����� �ػ󵵿� ������ ũ�⿡ ���� �۾��� �� ��� ���
 
 Toolkit : ����� �ػ�, ��ũ�� ����� �̹��� ������ ���� �� ���
 
 ����� ������� ������â ��ġ��Ű�� ��
 setLocation((����� �ػ�.width - ������ ũ��.width)/2, (����� �ػ�.height - ������ ũ��.height)/2);
 
 
 
 
 
 
 
 
*/
