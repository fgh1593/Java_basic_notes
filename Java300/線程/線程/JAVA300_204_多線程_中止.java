package �u�{;
//���n�ϥ� stop destroy��k����A�����I
//�Q�Υ~����k����
public class JAVA300_204_�h�u�{_����  implements Runnable{
	private boolean flag=true;
	public static void main(String[] args) {
		JAVA300_204_�h�u�{_���� Demo=new JAVA300_204_�h�u�{_����();
		new Thread(Demo,"A").start();
		//�D��k�u�{
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
	//���Ѥ�k����flag
	public void terminate() {
		this.flag=false;
	}
	
	
}
