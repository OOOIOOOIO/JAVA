package phone;

public abstract class PhoneAdapter implements Phone {

	
	
	public void turnOn() {
		System.out.println("���� Ű��");
	}
	
	public void turnOff() {
		System.out.println("���� ����");
	}
	
	@Override
	public void msg(String str, String tel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void call(String tel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void useInternet() {
		// TODO Auto-generated method stub

	}

}
