package innerAnonyClass;

public class OuterClass {
	int outData;
	
	public OuterClass() {
		System.out.println("�ܺ� Ŭ���� ������ ȣ���");
		
	}
	
	public void showOuter() {
		System.out.println("�ܺ� Ŭ������ �޼��� ȣ���");
		
	}
	
	
	
	public class InnerClass{ // ����Ŭ����, ĸ��ȭ
		int inData;
		
		public InnerClass() {
			System.out.println("���� Ŭ���� ������ ȣ���");
			
		}
		
		public void showInner() {
			outData = 20;		// ���ο��� �ܺ� �ʵ带 ���
			System.out.println("���� Ŭ������ �޼��� ȣ���");
			System.out.println("outData :" + outData);
			showOuter();		// ���ο��� �ܺ� �ʵ带 ���
		}
	}
	
	
	public static void main(String[] args) {
		OuterClass out = new OuterClass(); 				 // �ܺ� Ŭ���� ��ü ���� �� �ܺ� Ŭ���� ������ ȣ��
		OuterClass.InnerClass in = out.new InnerClass(); // ���� Ŭ���� ��ü ����  �� ���� Ŭ���� ������ ȣ��
														 // ���� Ŭ���� ���� ���
		
		in.showInner();
	}
}


/*

			<���� Ŭ����>

 Ŭ���� ���ο� Ŭ������ �����Ͽ� �ܺ� Ŭ������ �ʵ� ���ٿ� �����ϱ� ���ؼ� ��
���� Ŭ������ �ʵ带 ����ϱ� ���ؼ��� �ܺ� Ŭ�������� ���� Ŭ������ ��üȭ �ؾ��Ѵ�.
 
 ���� Ŭ������ GUI(Graphic User Interface) ���߽� ���� ����.
ex) a��� ��ư�� b��� ��ư�� �ִٰ� ����. �� ��ư�� ����� ���� �ٸ��ٸ�
	Ŭ������ ������ ����� �� ���� ���� Ŭ������ ����� ����ϴ� ���� �����ϴ�.
 ����Ŭ������ ����ϴ� ���� 
-ĸ��ȭ : AŬ�������� b��� �۾��� ���� ���̰�, �� �۾��� bŬ������ ������ ���� ������ �� ���� ��
	   �ٸ� Ŭ�������� b�۾��� �ʿ� ���ų�, bŬ������ �ܺο� �����Ű�� ���� ���� �� ����Ѵ�.
	   
	   
	   
 - ���� �� (�����̾�׷� �����ϸ� ����)
�ܺ�Ŭ���� ��ü�� = new �ܺ�Ŭ����������();
�ܺ�Ŭ������.����Ŭ������ ��ü�� = �ܺ�Ŭ������ü��.new ����Ŭ����������();

*/