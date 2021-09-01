package pb;

public class BreadPlate {
	
	private int breadCnt = 0; // 빵을 만들 때, 총 개수
	static int cnt = 1; // 빵을 먹었을 때
	
	
	public synchronized void makeBread() { // 동기화 하는 법 public synchronized
		if(breadCnt > 9) {
			System.out.println("빵이 가득 찼습니다.");
			try {
				wait(); // 대기시키기
			} catch (InterruptedException e) {
				 
				e.printStackTrace();
			}
		}
		else {
			breadCnt++;
			System.out.println("빵을 1개 만들었습니다. 총 : " + breadCnt + "개");
			
		}
		
	}
	
	
	public  synchronized void eatBread() { //  synchronized 붙은 애들끼리 동기화 됨
		if(cnt == 20) {
			System.out.println("빵이 다 떨어졌습니다");
			
		}
		else if(breadCnt < 1) {
			System.out.println("빵이 다 떨어졌습니다. 만들 떄 까지 기다려주세요");
			
		}
		else {
			breadCnt--;
			cnt++;
			System.out.println("빵을 1개 먹었습니다. 총 : " + breadCnt + "개");
			if(breadCnt < 10) {
				this.notify(); // 쓰레드 다시 실행
			}
		}
	}
}
