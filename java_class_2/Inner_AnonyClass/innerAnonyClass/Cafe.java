package innerAnonyClass;

public interface Cafe {
	//메뉴판
	void setMenu(String[] menu);
	String[] getMenu();
	void sell(String choice);
}

/*
<익명 클래스 Anonymous inner class>
이름이 없는 클래스(일회성으로 사용하기 위함).
안드로이드에서 아주 많이 자주 쓰이는 문법

*/