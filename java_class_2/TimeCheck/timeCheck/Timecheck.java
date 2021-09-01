package timeCheck;

public class Timecheck {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long end = 0L;
		
		int ar[] = new int[10000000];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i;
		}
		
		end = System.currentTimeMillis();
		System.out.println((double)(end - start) / 1000.0 + "ÃÊ");
	}
}
