package practice8_thread;

public class JAVA300_223_�h�u�{_�H���O�k {
	public static void main(String[] args) {
		����D A=new ����D();
		���� �۱j��=new ����(A);
		���l volvo=new ���l(A);
		�۱j��.start();
		volvo.start();

	}
}


class ����D{
	boolean flag=true;
	public synchronized void  ��U�]��() {
		if(flag==true) {
			try {
				this.wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("�����q���o");
		this.notifyAll();
		this.flag=!this.flag;
	}
	public synchronized void ���}�]��(){
		if(flag!=true) {
			try {
				this.wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("���l�q�L����D");
		this.notifyAll();
		this.flag=!this.flag;
	}
}

class ���� extends Thread{
	����D A=new ����D();
	
	public ����(����D a) {
		super();
		A = a;
	}

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
		A.��U�]��();
		try {
			currentThread().sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

class ���l extends Thread{
����D A=new ����D();
	
	public ���l(����D a) {
		super();
		A = a;
	}

	public void run() {
		for(int i=0;i<=20;i++) {
		A.���}�]��();
		}
	}
	
}