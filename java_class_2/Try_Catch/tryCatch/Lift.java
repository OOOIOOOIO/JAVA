package tryCatch;

public abstract class Lift {
	
	static int floor = 0;
	
	abstract void up();
	abstract void down();
	abstract void start(int choice);
	abstract void stop();
	abstract void go();
}
