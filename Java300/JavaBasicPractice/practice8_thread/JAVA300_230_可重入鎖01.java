package practice8_thread;

public class JAVA300_230_�i���J��01   {
	ReLock lock=new ReLock();
	public void a() throws InterruptedException {
		lock.lock();
		doSomething();
		lock.unlock();
	}
	
	//�i���J
	public void doSomething() throws InterruptedException  {
		lock.lock();
		//..............
		lock.unlock();
	}
	
	public static void main(String[] args) throws InterruptedException {
		JAVA300_230_���i���J�� a=new JAVA300_230_���i���J��();
		a.a();
		a.doSomething();
	}
}

//�i���J��
class ReLock{
	//�O�_�e��
	private boolean isLocked=false;
	Thread lockedBy =null;//�s�x�u�{
	private int holdCount=0;
	//�ϥ���
	public synchronized void lock() throws InterruptedException {
		Thread t =Thread.currentThread();
		while(isLocked && lockedBy!=t) {
			wait();
		}
		isLocked=true;
		lockedBy=t;
		holdCount ++;
	}
	//������
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