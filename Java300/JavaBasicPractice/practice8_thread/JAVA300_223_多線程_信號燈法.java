package practice8_thread;

public class JAVA300_223_多線程_信號燈法 {
	public static void main(String[] args) {
		平交道 A=new 平交道();
		火車 自強號=new 火車(A);
		車子 volvo=new 車子(A);
		自強號.start();
		volvo.start();

	}
}


class 平交道{
	boolean flag=true;
	public synchronized void  放下柵欄() {
		if(flag==true) {
			try {
				this.wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("火車通行囉");
		this.notifyAll();
		this.flag=!this.flag;
	}
	public synchronized void 打開柵欄(){
		if(flag!=true) {
			try {
				this.wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("車子通過平交道");
		this.notifyAll();
		this.flag=!this.flag;
	}
}

class 火車 extends Thread{
	平交道 A=new 平交道();
	
	public 火車(平交道 a) {
		super();
		A = a;
	}

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
		A.放下柵欄();
		try {
			currentThread().sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

class 車子 extends Thread{
平交道 A=new 平交道();
	
	public 車子(平交道 a) {
		super();
		A = a;
	}

	public void run() {
		for(int i=0;i<=20;i++) {
		A.打開柵欄();
		}
	}
	
}