package practice8_thread;
//�u�@�u�{:�O���Τ�u�{�A�Ȫ�;JVM����ε��ݦu�@�u�{���槹��
public class JAVA300_210_�u�@�u�{Daemon {
	public static void main(String[] args) {
		God god=new God();
		You you=new You();
			Thread t=new Thread(god);
			t.setDaemon(true);//�N�u�{�אּ�u�@�u�{
			t.start();
			new Thread(you).start();
	}
}

class You extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=365*100;i++) {
		System.out.println("happy life...");
		}
		System.out.println(".................");
	}
}

class God extends Thread{
	@Override
	public void run() {
		for(;true;) {
			System.out.println("bless you...");
		}
	}
}