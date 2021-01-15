package practice8_thread;

//應該鎖住的對象是 Account A
//若使用 同步方法於withdraw()上的話只鎖的到Human，並鎖不到我們的目標 Account A
//因此應該使用同步塊的方法鎖住  Account A
public class JAVA300_215_synchronized_同步塊 {
	public static void main(String[] args) {
		Account 夫妻共同基金 = new Account(200);
		Human h = new Human(150, 夫妻共同基金, "老公");
		Human w = new Human(100, 夫妻共同基金, "老婆");
		new Thread(h).start();
		new Thread(w).start();
	}
}

class Account {
	private int banksaving;

	public Account(int deposit) {
		this.banksaving = deposit;

	}

	public int getBanksaving() {
		return banksaving;
	}

	public void setBanksaving(int deposit) {
		this.banksaving = deposit;
	}

	public void showBanksaving() {
		System.out.println("帳戶餘額還剩" + banksaving + "元");
	}
}

class Human implements Runnable {
	int withdraw_money;
	Account A;
	String name;

	public Human(int withdraw_money, Account A, String name) {
		this.withdraw_money = withdraw_money;
		this.A = A;
		this.name = name;
	}

	@Override
	public void run() {
		withdraw();
	}

	public void withdraw() {
		synchronized (A) {
			if (A.getBanksaving() - withdraw_money < 0) {
				System.out.println("餘額不足");
				A.showBanksaving();
				return;
			}
			A.setBanksaving(A.getBanksaving() - withdraw_money);
			System.out.println(name + "取走了" + withdraw_money + "元");
			A.showBanksaving();
		}
	}
}
