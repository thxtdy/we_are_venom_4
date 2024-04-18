package Project;

public class Hana {

	private String bankName = "하나은행";
	int account = 168-48362-42;
	private int money = 50000;

	
	public void sendMoney(Busan b ,int money) {
		this.money -= money;
		b.recivedMoney(money);
	}
	/*public void sendMoney(Wuri w ,int money) {
		this.money -= money;
		w.recivedMoney(money);
	}
	public void sendMoney(Sin_han s ,int money) {
		this.money -= money;
		s.recivedMoney(money);
	}
	public void sendMoney(Kb k ,int money) {
		this.money -= money;
		.recivedMoney(money);
	}*/
	public void recivedMoney(int money) {
		this.money += money;
	}
	public void outMoney(int money) {
		this.money -= money;
	}
	public void showInfo() {
		System.out.println("고객님의 "+bankName + "계좌 잔액은"+this.money+"원 입니다");
	}
	public String getName() {
		return this.bankName;
	}
}
