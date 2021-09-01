package thread;

public class Thread1 extends Thread{
	String data;
	
	public Thread1(String data) {
		this.data = data;

	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(data);
			try {
				sleep(500);
			} 
			catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
}

/*

				<멀티 쓰레드>

1. Thread 클래스 상속
2. Runnable 인터페이스 구현


*/