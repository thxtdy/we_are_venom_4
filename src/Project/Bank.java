package Project;

public class Bank {

	String bankName;
	int account;
	private int money;
	int in;
	int out;
	
	//은행 고유 코드
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
	
	//출금
	public void sendMoney(int money) {
		this.money -= money;
	}
	
	//입금
	public void receiveMoney(int money) {
		this.money += money;
	}
	
}
