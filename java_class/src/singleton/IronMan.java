package singleton;

public class IronMan {
	
	private IronMan() {} // °´Ã¼ »ý¼º ¸·¾Æ³ð
	
	public static IronMan getInstance() { //°´Ã¼ÇÏ³ª¸¸ ¾²°Ô
		
		IronMan im = new IronMan();
		return im;	
	}
	
	public static void fight() {
		System.out.println("ºö ¹ß»ç");
		
	}
	
	public void walk() {
		System.out.println("³¯¾Æ°£´Ù.");
		
	}
}
