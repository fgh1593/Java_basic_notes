package practice8_thread;

//���������H�O Account A
//�Y�ϥ� �P�B��k��withdraw()�W���ܥu�ꪺ��Human�A���ꤣ��ڭ̪��ؼ� Account A
//�]�����ӨϥΦP�B������k���  Account A
public class JAVA300_215_synchronized_�P�B�� {
	public static void main(String[] args) {
		Account �ҩd�@�P��� = new Account(200);
		Human h = new Human(150, �ҩd�@�P���, "�Ѥ�");
		Human w = new Human(100, �ҩd�@�P���, "�ѱC");
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
		System.out.println("�b��l�B�ٳ�" + banksaving + "��");
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
				System.out.println("�l�B����");
				A.showBanksaving();
				return;
			}
			A.setBanksaving(A.getBanksaving() - withdraw_money);
			System.out.println(name + "�����F" + withdraw_money + "��");
			A.showBanksaving();
		}
	}
}
