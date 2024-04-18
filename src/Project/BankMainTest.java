package Project;

import java.util.Scanner;

public class BankMainTest {

	public static void main(String[] args) {

		Busan a = new Busan();
		Kb b = new Kb();
		Sin_han c = new Sin_han();
		Hana d = new Hana();
		Wuri e = new Wuri();

		String bankname;
		String bankname2;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("로그인");
			System.out.print("이름 : ");
			String name = sc.next();
			if (name.equals("박태현")) {
				System.out.println("어서오세요 " + name + "님 " + /* c.bankName */ " 계좌관리 시스템 입니다.");
				break;
			} else if (name.equals("김남철")) {
				System.out.println("어서오세요 " + name + "님 " + b.bankName + " 계좌관리 시스템 입니다.");
				break;
			} else if (name.equals("변영준")) {
				System.out.println("어서오세요 " + name + "님 " + /* a.bankName */ " 계좌관리 시스템 입니다.");
				break;
			} else if (name.equals("송원석")) {
				System.out.println("어서오세요 " + name + "님 " + d.getName() + " 계좌관리 시스템 입니다.");
				System.out.println("무엇을 도와드릴까요? \n 1.입금하기 2.출금하기 3.내 잔액 확인하기 4.시스템 종료");
				int num2 = sc.nextInt();
				if (num2 == 1) {
					System.out.println("계좌번호를 입력해주세요 (하이픈 표시 생략)");
					String account = sc.next();
					if (account.equals("1954565424")) {
						System.out.println("변영준(부산은행) 님께 얼마를 보내시겠습니까?");
						int sendmoney = sc.nextInt();
						d.sendMoney(a, sendmoney);
						System.out.println("변영준(부산은행) 님께 " + sendmoney + "원을 입금했습니다.");
						d.showInfo();
					}
					break;
				} else if (name.equals("이윤서")) {
					System.out.println("어서오세요 " + name + "님 " + /* e.bankName */ " 계좌관리 시스템 입니다.");
					break;
				} else {
					System.out.println("잘못선택하셨습니다 다시 선택해주세요.");
					continue;
				}
			}
		}
	}
}
