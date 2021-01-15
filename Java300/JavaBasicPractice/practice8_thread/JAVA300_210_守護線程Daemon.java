package practice8_thread;
//守護線程:是為用戶線程服務的;JVM停止不用等待守護線程執行完畢
public class JAVA300_210_守護線程Daemon {
	public static void main(String[] args) {
		God god=new God();
		You you=new You();
			Thread t=new Thread(god);
			t.setDaemon(true);//將線程改為守護線程
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