package tryCatch;

import java.util.Scanner;

public class Elevator extends Lift{
	final int maxFloor = 10;
	final int minFloor = -3;
	
	@Override
	void up() {
		floor++;
		
	}

	@Override
	void down() {
		floor--; 
		
	}

	@Override
	void start(int choice) {
		if(choice < floor) { //  여기서는 floor 양수
			for(int i = 0; i <= floor-choice + i; i++) {
				if(floor != 0) {
					System.out.println(floor + "층");
//					try {
//						Thread.sleep(1000);
//					} 
//					catch (InterruptedException e) {
//						
//					}
				}
				down();
				
			}
			stop();
		}
		else if(choice != floor) { // 여기서는 floor 음수
			for(int i = 0; i <= choice - floor + i ; i++) {
				if(floor != 0) {
					System.out.println(floor + "층");
//					try {
//						Thread.sleep(1000);
//					} 
//					catch (InterruptedException e) {
//						
//					}
				}
				up();
			}
			stop();
		}
		else {
			System.out.println("같은 층 선택 불가");
		}
	}

	@Override
	void stop() {
		System.out.println("도착하였습니다.");
		
	}

	@Override
	void go() {
		int choice = 0;
		String msg = "";
		while(true) {
			msg = "층수를 입력하세요(현재층  : " + floor + "층)";
			System.out.println(msg);
			choice = new Scanner(System.in).nextInt(); // 객체없이 바로 생성자랑 메서드 실행
			// 층수 입력
			
			if(choice > maxFloor || choice < minFloor) {
				System.out.println("B3층부터 10층까지만 운행합니다.");
			}
			else {
				break; // 층수를 올바르게 선택할 때만 break
			}
		}
		start(choice);
		
	}
 
}
