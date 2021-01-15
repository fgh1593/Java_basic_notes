package practice8_thread;

//InheritableThreadLocal 線程會繼承Main方法的上下文  拷貝一份給子線程

public class JAVA300_229_ThreadLocalTest04_InheritableThreadLocal {
	private static ThreadLocal<Integer> threadLocal = new InheritableThreadLocal<Integer>();

	public static void main(String[] args) {
		threadLocal.set(0);
		System.out.println(Thread.currentThread().getName()+"-----"+threadLocal.get());
		//若為一般ThreadLocal將會得到null
			new Thread(new MyThread()).start();
		
	}

	public static class MyThread implements Runnable {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + "得到了----" +threadLocal.get() );
			
		}

	}

}
