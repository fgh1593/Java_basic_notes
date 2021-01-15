package practice8_thread;

public class JAVA300_230_���i���J��   {
	Lock lock=new Lock();
	public void a() throws InterruptedException {
		lock.lock();
		doSomething();
		lock.unlock();
	}
	
	//���i���J
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

//���i���J��
class Lock{
	//�O�_�e��
	private boolean isLocked=false;
	//�ϥ���
	public synchronized void lock() throws InterruptedException {
		while(isLocked) {
			wait();
		}
		isLocked=true;
	}
	//������
	public synchronized void unlock() {
		isLocked=false;
		notify();
	}
}