package pb;

public class BreadPlate {
	
	private int breadCnt = 0; // ���� ���� ��, �� ����
	static int cnt = 1; // ���� �Ծ��� ��
	
	
	public synchronized void makeBread() { // ����ȭ �ϴ� �� public synchronized
		if(breadCnt > 9) {
			System.out.println("���� ���� á���ϴ�.");
			try {
				wait(); // ����Ű��
			} catch (InterruptedException e) {
				 
				e.printStackTrace();
			}
		}
		else {
			breadCnt++;
			System.out.println("���� 1�� ��������ϴ�. �� : " + breadCnt + "��");
			
		}
		
	}
	
	
	public  synchronized void eatBread() { //  synchronized ���� �ֵ鳢�� ����ȭ ��
		if(cnt == 20) {
			System.out.println("���� �� ���������ϴ�");
			
		}
		else if(breadCnt < 1) {
			System.out.println("���� �� ���������ϴ�. ���� �� ���� ��ٷ��ּ���");
			
		}
		else {
			breadCnt--;
			cnt++;
			System.out.println("���� 1�� �Ծ����ϴ�. �� : " + breadCnt + "��");
			if(breadCnt < 10) {
				this.notify(); // ������ �ٽ� ����
			}
		}
	}
}
