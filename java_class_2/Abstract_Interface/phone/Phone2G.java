package phone;

public class Phone2G extends PhoneAdapter {
	@Override
	public void msg(String str, String tel) {
		System.out.println(tel + "에게 전송중" +  "\n내용 : " + str);
		
	}

	@Override
	public void call(String tel) {
		System.out.println(tel + "에게 전화거는중");
		
	}

	
}
