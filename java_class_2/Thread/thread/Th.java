package thread;

public class Th extends Thread {
	
	public Th(String name) {
		super(name); // 쓰레드 이름 짓는 법 Th의 부모클래스가 Thread이기 때문에
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
	
	public static void main(String[] args) { // main도 쓰레드다
		Th thread1 = new Th("First");
		Th thread2 = new Th("Second");
		
		thread1.start();
		thread2.start();
		
		
		try {
			thread1.join(); // join 앞에 있는 쓰레드가 끝나면 그 다음 쓰레드 실행할래요
			thread1.join(); // 쓰레드 사용시 쓰레드 종료 전 다음 로직 수행시 예기치 못한 치명적인 오류 발생
							// 그러므로 join() 사용시 밑에 로직들은 쓰레드가 종료 될 때까지 대기 후 실행됨
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main 종료");
	}
}
