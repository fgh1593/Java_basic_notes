package �u�{;
//�ϥ�ReentrantLock�Y�i�F���i���J��A�þ֦��󧹵��\��
import java.util.concurrent.locks.ReentrantLock;

public class JAVA300_230_�i���J��02_ReentrantLock   {
	ReentrantLock lock=new ReentrantLock();
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


