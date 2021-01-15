package practice8_thread;

//ThreadLocal 分析上下文  觀察其環境起點
//構造器:誰調用就屬於誰
//run方法:屬於物件線程自身的
public class JAVA300_229_ThreadLocalTest03 {
	private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> {
		return -100;
	});

	public static void main(String[] args) {
			new Thread(new MyThread()).start();
			new Thread(new MyThread()).start();
		
	}

	public static class MyThread implements Runnable {
		public MyThread() {
			System.out.println(Thread.currentThread().getName() +threadLocal.get());;
		}
		@Override
		public void run() {
			threadLocal.set(0);
			System.out.println(Thread.currentThread().getName() + "得到了----" +threadLocal.get() );
			
		}

	}

}
