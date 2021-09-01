package thread;

public class Zoo {
	public static void main(String[] args) {
		
		Duck duck = new Duck();
		Pig pig = new Pig();
		Cat cat = new Cat();
		
		Thread tduck = new Thread(duck);
		Thread tpig = new Thread(pig);
		Thread tcat = new Thread(cat);
		
		tduck.start();
		tpig.start();
		
		try {
			tduck.join();
			tpig.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tcat.start();
	}
}
