package practice8_thread;

//Lambda僅能使用於 僅擁有一個方法的接口或父類
public class JAVA300_202_LambdaThread推導 {
	// 第一型態:外部類
	// 第二型態:靜態內部類
	static class Test02 implements Runnable {
		public void run() {
			System.out.println("想念妳第二次");
		}
	}

	public static void main(String[] args) {
		// 第一型態執行
		Test01 test01 = new Test01();
		new Thread(test01).start();
		// 第二型態執行
		new Thread(new Test02()).start();
		// 第三型態:局部內部類
		class Test03 implements Runnable {
			public void run() {
				System.out.println("想念妳第三次");
			}
		}
		// 第三型態執行
		new Thread(new Test03()).start();

		// 第四型態:匿名內部類，需要借助接口與副類，不需要生成代理與本體的對象
		// 適合僅使用一次的代碼
		// 第四型態執行
		new Thread(new Runnable() {
			public void run() {
				System.out.println("想念妳第四次");
			}
		}).start();

		// 第五型態:lambda簡化 jdk8以上使用
		
		//省略第四型態的接口和其內方法
		new Thread(// new Runnable() {
				// public void run
				() -> {
					System.out.println("想念妳第五次");
				}).start();
		
		
		new Thread(() -> {
			System.out.println("想念妳第五次");
		}).start();
	}
}
