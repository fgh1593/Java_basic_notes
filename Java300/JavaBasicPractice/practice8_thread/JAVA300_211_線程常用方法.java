package practice8_thread;
// .isAlive() �P�_�u�{�O�_�s�b
// .setName() �]�w�u�{�W
// .getName() ���o�u�{�W
// .currentThread() ��e�u�{
public class JAVA300_211_�u�{�`�Τ�k {
	public static void main(String[] args) throws InterruptedException {
		Myinfo i=new Myinfo("����W");
		Thread t=new Thread(i);
		t.setName("�u�{�W");
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
