package phone;
/*
 * phone 인터페이스 or 추상 클래스) 내에서 모든 핸드폰이 사용하는 기능 정의
 * phone 2g, 3g, 4g 구현
 * user 클래래스에서 3가지 전부 구현
 */
public interface Phone {
	void msg(String str, String tel);
	void call(String tel);
	void useInternet();
}
