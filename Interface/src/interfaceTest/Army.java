package interfaceTest;



public abstract class Army implements Soldier {

	//인터페이스에서 골라서 재정의하고 싶을 때 
	//앱스트랙 클래스로 임플리먼트 해서 
	//앱스트랙 클래스를 익스텐즈하면
	//골라서 재정의할 수 있다. (앱스트랙 클래스를 어댑터라 함)
	
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub

	}

	@Override
	public void salute() {
		// TODO Auto-generated method stub

	}

}
