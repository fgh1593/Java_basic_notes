package 線程;
//不要使用 stop destroy方法中止，有風險
//利用外部方法中止
public class JAVA300_204_多線程_中止  implements Runnable{
	private boolean flag=true;
	public static void main(String[] args) {
		JAVA300_204_多線程_中止 Demo=new JAVA300_204_多線程_中止();
		new Thread(Demo,"A").start();
		//主方法線程
		for(long i=0;i<1000000000;i++) {
			if(i==900000) {
				Demo.terminate();
				System.out.println("Over");
			}
		}
	}

	@Override
	public void run() {
		int i=0;
		while(flag) {
			System.out.println("a"+(i++));
		}
	}
	//提供方法改變flag
	public void terminate() {
		this.flag=false;
	}
	
	
}
