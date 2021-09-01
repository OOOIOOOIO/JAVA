package generic;

public class GClass {
	public static void main(String[] args) {
		
		GClassTest<String> g = new GClassTest<>(); // ¹«½¼ Å¸ÀÔÀ¸·Î ¾µ Áö Á¤ÀÇÇØÁà¾ßµÊ
		GClassTest<Integer> g2  = new GClassTest<>();
		g2.setData(10);
		g.setData("¾È³ç");
		
		//g.setData(10.5);
		System.out.println(g2.getData());
		System.out.println(g.getData());
		
	}
}
