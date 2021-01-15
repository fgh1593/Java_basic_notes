package practice8_thread;

public class JAVA300_230_可重入鎖01   {
	ReLock lock=new ReLock();
	public void a() throws InterruptedException {
		lock.lock();
		doSomething();
		lock.unlock();
	}
	
	//可重入
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

//可重入鎖
class ReLock{
	//是否占用
	private boolean isLocked=false;
	Thread lockedBy =null;//存儲線程
	private int holdCount=0;
	//使用鎖
	public synchronized void lock() throws InterruptedException {
		Thread t =Thread.currentThread();
		while(isLocked && lockedBy!=t) {
			wait();
		}
		isLocked=true;
		lockedBy=t;
		holdCount ++;
	}
	//釋放鎖
	public synchronized void unlock() {
		if(Thread.currentThread()==lockedBy) {
		holdCount --;
		if(holdCount ==0) {
		isLocked=false;
		notify();
		lockedBy=null;
		}
		}
	}
}