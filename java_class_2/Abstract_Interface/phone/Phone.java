package phone;
/*
 * phone �������̽� or �߻� Ŭ����) ������ ��� �ڵ����� ����ϴ� ��� ����
 * phone 2g, 3g, 4g ����
 * user Ŭ���������� 3���� ���� ����
 */
public interface Phone {
	void msg(String str, String tel);
	void call(String tel);
	void useInternet();
}
