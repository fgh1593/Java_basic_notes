package 線程;

public class JAVA300_199_龜兔賽跑 implements Runnable {
	String winner;
	
	private boolean gameOver(int i) {
		if(winner!=null) {
			return true;
		}else if(i==100 && winner==null) {
			winner=Thread.currentThread().getName();
			System.out.println(winner+"贏得了比賽");
			return true;
		}else {
			return false;
		}
	}
	
	
	
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			//利用Thread.sleep()延遲線程 模擬兔子偷懶
			System.out.println(Thread.currentThread().getName()+"---"+i);
			if(Thread.currentThread().getName()=="兔子") {
				try {
					Thread.sleep(1);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(gameOver(i)) {
				break;
			}
			}
	}
	
	
	
	public static void main(String[] args) {
		JAVA300_199_龜兔賽跑 race=new JAVA300_199_龜兔賽跑();
		new Thread(race,"烏龜").start();
		new Thread(race,"兔子").start();
	}

}
