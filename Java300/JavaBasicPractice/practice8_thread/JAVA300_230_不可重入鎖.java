package practice8_thread;

public class JAVA300_230_不可重入鎖   {
	Lock lock=new Lock();
	public void a() throws InterruptedException {
		lock.lock();
		doSomething();
		lock.unlock();
	}
	
	//不可重入
	public void doSomething() throws InterruptedException  {
		lock.lock();
		//..............
		lock.unlock();
	}
	
	public static void main(String[] args) throws InterruptedException {
		JAVA300_230_不可重入鎖 a=new JAVA300_230_不可重入鎖();
		a.a();
		a.doSomething();
	}
}

//不可重入鎖
class Lock{
	//是否占用
	private boolean isLocked=false;
	//使用鎖
	public synchronized void lock() throws InterruptedException {
		while(isLocked) {
			wait();
		}
		isLocked=true;
	}
	//釋放鎖
	public synchronized void unlock() {
		isLocked=false;
		notify();
	}
}