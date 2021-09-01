package interfaceTest;

public class Sergeant extends Army{
	
	public void eat() {
		System.out.println("안먹고 자러 간다 ");

	}
	
	@Override
	public void sleep() {
		System.out.println("하루종일 잔다");
	}
	
	@Override
	public void play() {
		System.out.println("하루종일 논다");
	}
	
}
