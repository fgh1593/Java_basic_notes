package �u�{;

public class JAVA300_199_�t���ɶ] implements Runnable {
	String winner;
	
	private boolean gameOver(int i) {
		if(winner!=null) {
			return true;
		}else if(i==100 && winner==null) {
			winner=Thread.currentThread().getName();
			System.out.println(winner+"Ĺ�o�F����");
			return true;
		}else {
			return false;
		}
	}
	
	
	
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			//�Q��Thread.sleep()����u�{ �����ߤl���i
			System.out.println(Thread.currentThread().getName()+"---"+i);
			if(Thread.currentThread().getName()=="�ߤl") {
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
		JAVA300_199_�t���ɶ] race=new JAVA300_199_�t���ɶ]();
		new Thread(race,"�Q�t").start();
		new Thread(race,"�ߤl").start();
	}

}
