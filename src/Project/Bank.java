package Project;

public class Bank {

	String bankName;
	int account;
	private int money;
	int in;
	int out;
	
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
