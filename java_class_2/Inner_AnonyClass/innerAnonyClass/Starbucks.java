package innerAnonyClass;

public class Starbucks {
	private String[] arMenu = new String[3];
	private String[] menu = {"아메리카노", "블랙티", "카푸치노"};
	private int[] arPrice = {5000, 8000, 9000};
	private int income;
	String choice = "카푸치노";
	
	
	

	public String[] getMenu() {
		return menu;
	}



	public void setMenu(String[] menu) {
		this.menu = menu;
	}



	public int[] getArPrice() {
		return arPrice;
	}



	public void setArPrice(int[] arPrice) {
		this.arPrice = arPrice;
	}



	public int getIncome() {
		return income;
	}



	public void setIncome(int income) {
		this.income = income;
	}



	public void registCafe(Cafe c) { 
		//Cafe 타입을 c로 객체화 인터페이스니까 재정의 해줘야됨
		c.setMenu(menu); //사용
		System.out.println("카페 등록 완료");
		System.out.println("===========Menu=========");
		
		for (int i = 0; i < c.getMenu().length; i++) {
			System.out.println(i+1 + c.getMenu()[i]); // 사용
		}
		c.sell(choice); // 사용
		
	}
	
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		gangnam.registCafe(new Cafe() { //인터페이스 Cafe 재정의, 익명클래스
										//new Cafe가 하나의 매개변수
			@Override
			public void setMenu(String[] menu) {
				gangnam.menu = menu;
				
			}
			
			@Override
			public void sell(String choice) {
				for (int i = 0; i < gangnam.getMenu().length; i++) {
					if(gangnam.getMenu()[i].equals(choice)) {
						gangnam.income += gangnam.arPrice[i];
					}
				}
				
			}
			
			@Override
			public String[] getMenu() {
				
				return gangnam.menu;
				
			}
		});
		
		System.out.println("카푸치노 주문 완료");
		System.out.println("현재 수익: " + gangnam.getIncome());
		
	}
}
