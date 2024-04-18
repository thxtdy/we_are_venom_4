package Project;

public class Hana {

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
		
		final int 이윤서 = 1;
		final int 김민철 = 2;
		final int 송원석 = 3;
		final int 변영준 = 4;
		final int 박태현 = 5;
		
		public int getMoney() {
			return money;
		}
		public void setMoney(int money) {
			this.money = money;
		}
		
		//출금
		public void sendMoney(int bankname,String username,int money) {
			if(bankname ==1) {
				bankname = KB;
			}
			else if(bankname ==2) {
				bankname = SIN_HAN;
			}
			else if(bankname ==3) {
				bankname = WURI;
			}
			else if(bankname ==4) {
				bankname = HANA;
			}
			else if(bankname ==5) {
				bankname = BUSAN;
			} else {
				System.out.println("존재하지 않는 은행입니다.");
			}
			System.out.println(bankname + "은행으로" + username + "님에게 "+ money+"원을 보냈습니다.");
			this.money -= money;
			//bankname.receiveMoney(bankname,username,money);
		}
		
		//입금
		public void receiveMoney(int bankname,String username,int money ) {
			// 만약 
			if(bankname ==1) {
				bankname = KB;
			}
			else if(bankname ==2) {
				bankname = SIN_HAN;
			}
			else if(bankname ==3) {
				bankname = WURI;
			}
			else if(bankname ==4) {
				bankname = HANA;
			}
			else if(bankname ==5) {
				bankname = BUSAN;
			} else {
				System.out.println("존재하지 않는 은행입니다.");
			}
			System.out.println(bankname + "은행에서" + username + "님이 "+ money+"원을 보냈습니다.");
			this.money += money;
		}
}
