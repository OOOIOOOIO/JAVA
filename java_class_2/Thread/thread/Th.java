package thread;

public class Th extends Thread {
	
	public Th(String name) {
		super(name); // ������ �̸� ���� �� Th�� �θ�Ŭ������ Thread�̱� ������
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(super.getName() + " thread. i = " + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		super.run();
	}
	
	public static void main(String[] args) { // main�� �������
		Th thread1 = new Th("First");
		Th thread2 = new Th("Second");
		
		thread1.start();
		thread2.start();
		
		
		try {
			thread1.join(); // join �տ� �ִ� �����尡 ������ �� ���� ������ �����ҷ���
			thread1.join(); // ������ ���� ������ ���� �� ���� ���� ����� ����ġ ���� ġ������ ���� �߻�
							// �׷��Ƿ� join() ���� �ؿ� �������� �����尡 ���� �� ������ ��� �� �����
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main ����");
	}
}
