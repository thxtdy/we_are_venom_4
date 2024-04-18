package Project;

public class Sin_han {
	
	String bankname;
	int money;
	int account;
	int fee;
	
	final int KB = 1;       
	final int SIN_HAN = 2;  
	final int WURI = 3;     
	final int HANA = 4;     
	final int BUSAN = 5;

	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void sendMoney(String name) {
		bankname = name;
		
//		if(name == 1) {
//			System.out.println("국민은행을 선택하셨습니다.");
//		}else if(name == 2) {
//			System.out.println("신한은행을 선택하셨습니다.");
//		}else if(name == 3) {
//			System.out.println("신한은행을 선택하셨습니다.");
//		}else if(name == 4) {
//			System.out.println("신한은행을 선택하셨습니다.");
//		}else if(name == 5) {
//			System.out.println("신한은행을 선택하셨습니다.");
//		}else {
//			System.out.println("잘못된 요청입니다.");
//		}
	}
	
	Bank bank = new Bank();
	
	public Sin_han() {
		
		
		
	}
	
}
