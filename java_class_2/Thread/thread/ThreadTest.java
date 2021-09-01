package thread;

public class ThreadTest {
	public static void main(String[] args) {
		//Thread 클래스
		Thread1 th1 = new Thread1("1번 쓰레드");
		Thread1 th2 = new Thread1("2번 쓰레드");
		
		
		//Runnable 인터페이스
		Thread2 t1 = new Thread2("!");
		Thread2 t2 = new Thread2("?");
		Thread thread1 = new Thread(t1); // Thread 클래스를 객체화해서 거기에 Runnable 인터페이스를 받은 객체를 넣어야 쓸 수 있음
		Thread thread2 = new Thread(t2);
		
		
		//th1.start(); // 멀티 쓰레드는 start를 써줘야됨
		//th2.start(); // start 안엑 run이 있고 start를 해주면 객체들을 다 찾아서 run을 해줌
		
		thread1.start();
		thread2.start();
	}
}
