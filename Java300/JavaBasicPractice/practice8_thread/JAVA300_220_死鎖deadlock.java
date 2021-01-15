package practice8_thread;

//死鎖:過多的同步可能造成相互不釋放資源
//從而互相等待，一般發生於同步中持有多個對象的鎖
//解決死鎖的方法就是不要將鎖寫在另一個鎖裡
public class JAVA300_220_死鎖deadlock {
	public static void main(String[] args) {
		Makeup A = new Makeup(0, "A");
		Makeup B = new Makeup(1, "B");
		A.start();
		B.start();
	}

}

//口紅
class Lipstick {

}

//鏡子
class Mirror {

}

//化妝
class Makeup extends Thread {
	// 選擇
	static Lipstick lipstick = new Lipstick();
	static Mirror mirror = new Mirror();

	int choice;
	String girl;

	public Makeup(int choice, String girl) {
		super();
		this.choice = choice;
		this.girl = girl;
	}

	public void run() {
		try {
			makeup();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 相互持有對方的鎖，可能造成死鎖
	private void makeup() throws InterruptedException {
		if (choice == 0) {
			synchronized (lipstick) {// 獲得口紅的鎖
				System.out.println(this.girl + "獲得口紅");
				// 一秒鐘後想獲得鏡子的鎖
				Thread.sleep(1000);
//--------------------錯誤位置
//				synchronized (mirror) {
//					System.out.println(this.girl + "照鏡子");
//				}
//--------------------錯誤位置
			}
			//解決死鎖的方法就是不要將鎖寫在另一個鎖裡
			synchronized (mirror) {
				System.out.println(this.girl + "照鏡子");
			}
		} else {
			synchronized (mirror) {
				System.out.println(this.girl + "照鏡子");
				Thread.sleep(2000);
//				synchronized (lipstick) {
//					System.out.println(this.girl + "獲得口紅");
//				}
			}
			synchronized (lipstick) {
				System.out.println(this.girl + "獲得口紅");
			}
		}
	}
}