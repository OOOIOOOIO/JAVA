package layoutTest;

public class Explain {

}
/*

						<BorderLayouy>
 BorderLayout�� ������ ��Ƽ� ���� �����̳ʿ� ������Ʈ�� ��ġ�� �� �ֵ������ش�.
�����̳ʸ� 5�� �������� ������ ������ ������ ������Ʈ�� ��ġ�ϴ� ���̾ƿ� �Ŵ����̴�.

���¹�
add(������Ʈ, ����) : ������ ������ CENTER�� �⺻��
add(label, border.SOUTH)
add(laber, BorderLayout.NORTH)
add("South", label) : ������ �Ѱ��� �� ���ڿ��� �� ��� ù ���ڸ� �빮��

�� �����̳ʿ� �������� ������Ʈ�� �ø� �� panner, JPanel�� ������Ʈ�� ��ġ �� �����̳ʿ� �ø��� ����.

				
				
				
				
				
				
						<FlowLayout>
						
FlowLayout�� �����̳�(Frame, JFrame)�� �����̳�(Panel, JPanel), ������Ʈ(Label, JLabel)�� ���� ũ���
�������� ��ġ�ϴ� ���̾ƿ� �Ŵ����̴�. �������� ������Ʈ�� �ϳ��� ���״Ͼ� �߰��� �� ��ġ�� �ʰ� ������
ũ��� ������� ���� �� �ֵ��� ���ش�


���� ��
setLayout(new FlowLayout());

label.setBackground(Color) : Label�� ������ ����
label.setForeground(Color) : Label�� ���ڻ��� ����
label.setAlignment(Label) : Label�� �ؽ�Ʈ ���� ����� ����

FlowLayout ��ü�� ������ �� �����̳��� ���� ����� ������ �� �ִ�.

new FlowLayout(FlowLayout.CENTER);
new FlowLayout(FlowLayout.LEFT);
new FlowLayout(FlowLayout.RIGHT);

add(��ü, ��ü.CENTER or FlowLayout.CENTER);

��������
label.setHorizontalAlignment(JLabel.LEFT)

��������
label.setVerticalAlignment(JLabel.LEFT)

-----------------------------------------------------------------------------
Font Ŭ����

Label������ �۲��� �������̴�.(JLabel�� �ѱ� �۲� ��밡��)
name : Serif, SansSerif, Monospaced, Dialog, DialogInput(�� �۲õ鸸 ��밡��)
style : Font.BOLD : ����, Font.ITALIC : �����, FONT.PLAIN : ������

add(label) : �����̳ʿ� ������Ʈ �߰��Ѵ�

JLabel��ü�� ������ �����Ϸ��� setOpaque(true)�� �����ؼ� ����� �����ϰ� ������Ѿ� �Ѵ�.

setPreferredSize(new DImension(size, size)); // ������Ʈ�� ũ�⺯��


-----------------------------------------------------------------------------
 						< GridLayout>
 						
 GridLayout�� �����̳ʸ� ����(grid, �ٵ���) ������� ������ ������Ʈ�� ������ ������
������� ��ġ�ϴ� ���̾ƿ� �Ŵ����̴�.

GridLayout grid = new GridLayout(4, 4);  --> ���� ���� 4�� 4��¥�� GridLayout
GridLayout grid = new GridLayout(4, 4, 3, 0);  --> ���� ������ 3�� "
GridLayout grid = new GridLayout(4, 4, 0, 3);  --> ���� ������ 3�� "
GridLayout grid = new GridLayout(4, 4, 3, 3);  --> ��� ������ 3�� "

������Ʈ(��ư) ������
setEnable(false) : ������Ʈ�� ��Ȱ��ȭ ��Ų��
setVisible(false) : ������Ʈ�� �����̳ʸ� ǥ������ �ʴ´�.

��ư ���� �۾��� ���� ��
getActionConmmand() : ��ư ���� ���ڸ� ���´�.

��ư ���� �۾��� ���� ��
setName() : ������Ʈ�� �̸��� �־��ش�
getName() : ������Ʈ�� �̸��� ���´�









*/