package thread;

public class ThreadTest {
	public static void main(String[] args) {
		//Thread Ŭ����
		Thread1 th1 = new Thread1("1�� ������");
		Thread1 th2 = new Thread1("2�� ������");
		
		
		//Runnable �������̽�
		Thread2 t1 = new Thread2("!");
		Thread2 t2 = new Thread2("?");
		Thread thread1 = new Thread(t1); // Thread Ŭ������ ��üȭ�ؼ� �ű⿡ Runnable �������̽��� ���� ��ü�� �־�� �� �� ����
		Thread thread2 = new Thread(t2);
		
		
		//th1.start(); // ��Ƽ ������� start�� ����ߵ�
		//th2.start(); // start �ȿ� run�� �ְ� start�� ���ָ� ��ü���� �� ã�Ƽ� run�� ����
		
		thread1.start();
		thread2.start();
	}
}
