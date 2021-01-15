package practice8_thread;
// .isAlive() 判斷線程是否存在
// .setName() 設定線程名
// .getName() 取得線程名
// .currentThread() 當前線程
public class JAVA300_211_線程常用方法 {
	public static void main(String[] args) throws InterruptedException {
		Myinfo i=new Myinfo("物件名");
		Thread t=new Thread(i);
		t.setName("線程名");
		t.start();
		System.out.println(t.isAlive());
		t.sleep(100);
		System.out.println(t.isAlive());
	}
	
	
}

class Myinfo implements Runnable{
	private String name;
	public Myinfo(String name) {
		this.name=name;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+"---"+name);
	}
}
