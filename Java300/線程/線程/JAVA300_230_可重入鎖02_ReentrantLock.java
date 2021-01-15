package 線程;
//使用ReentrantLock即可達成可重入鎖，並擁有更完善功能
import java.util.concurrent.locks.ReentrantLock;

public class JAVA300_230_可重入鎖02_ReentrantLock   {
	ReentrantLock lock=new ReentrantLock();
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


