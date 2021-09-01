package java_class;

import java.util.Random;

class Avengers{
	public void fight() {
		System.out.println("Avengers Assemble");
	}
	
}


class IronMan extends Avengers{
	@Override
	public void fight() {
		System.out.println("Beam!");
	}
}


class Thor extends Avengers{
	
	@Override
	public void fight() {
		System.out.println("Thunder Hammer!");
	}
}


class Hulk extends Avengers{
	
	@Override
	public void fight() {
		System.out.println("Big green monster!");
	}
}


class CaptainAmerica extends Avengers{
	@Override
	public void fight() {
		System.out.println("Throw the shield!");
	}
}


class HawkEye extends Avengers{
	@Override
	public void fight() {
		System.out.println("Arrow Bomb!");
	}
}


class BlackWidow extends Avengers{
	@Override
	public void fight() {
		System.out.println("kick and punch!");
	}
}


class Loki extends Avengers{
	@Override
	public void fight() {
		System.out.println("Duplication");
	}
}

public class Polymorphism {
	
	public boolean whoAreYou(Avengers a){ 
		// a = new ���� Ŭ������()'�� �ǹ��� !!! �߿�` a�� Avengers�� �ƴ�
		boolean isLoki = false;
		if(a instanceof IronMan) {
			System.out.println("I AM IRONMAN");
		}
		else if(a instanceof Thor){
			System.out.println("I AM Thor");
		}
		else if(a instanceof CaptainAmerica){
			System.out.println("I AM CaptainAmerica");
		}
		else if(a instanceof Hulk){
			System.out.println("I AM Hulk");
		}
		else if(a instanceof BlackWidow){
			System.out.println("I AM BlackWidow");
		}
		else if(a instanceof HawkEye){
			System.out.println("I AM HawkEye");
		}
		else if(a instanceof Loki){
			System.out.println("we find Loki!");
			isLoki = true;
		}
		else {
			System.out.println("I AM Villain!");
		}
		return isLoki; // ��Ű�� ������ �극��ũ���ֱ� - boolean�� ���
	}
	
	
	public static void main(String[] args) {
		
		Polymorphism p = new Polymorphism();
		Random r = new Random();
		
		Avengers[] avengers = {
				new IronMan(),
				new Thor(),
				new CaptainAmerica(),
				new HawkEye(),
				new Hulk(),
				new BlackWidow(),
		};
		
		for(int i = 0; i < 100; i++) {
			int index = r.nextInt(7);
			
			if(p.whoAreYou(avengers[index])) break; //��Ű�� ������ true�ϰ� �극��ũ
			try {
				Thread.sleep(500);
			} 
			catch (InterruptedException e) {
				
			}
		}
	}
}
