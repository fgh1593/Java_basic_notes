package �u�{;
//��{�Ͳ��̮��O�̼ҫ���k���@:�޵{�k

public class JAVA300_222_�h�u�{_�ֵo��@cooperation_�޵{�k {
	public static void main(String[] args) {
		SynContainer container=new SynContainer();
		Productor p1=new Productor(container);
		Productor p2=new Productor(container);
		Consumer c1=new Consumer(container);
		Consumer c2=new Consumer(container);
		p1.start();
		p2.start();
		c1.start();
		
	}
}

//�Ͳ���
class Productor extends Thread{
	SynContainer container;
	public Productor(SynContainer container) {
		this.container=container;
	}
	@Override
	public void run() {
		//�Ͳ�
		for(int i=	1;i<=100;i++) {
			System.out.println("�Ͳ���"+i+"�Ӱӫ~");
			container.store(new Product(i));
		}
		
	}
}

//���O��
class Consumer extends Thread{
	SynContainer container;
	public Consumer(SynContainer container) {
		this.container=container;
	}
	@Override
	public void run() {
		//���O
		for(int i=0;i<100;i++) {
			System.out.println("���O��"+container.sell().getId()+"�Ӱӫ~");
			
		}
		
	}
}
//�w�İ�
class SynContainer{
	Product[] products=new Product[10];
	//�p�ƾ�
	int count=0;
	//�s�x
	public synchronized void store(Product product) {
		//��ɯ�Ͳ��A�e���s�b�Ŷ�
		
		//����Ͳ�
		if(count==products.length) {
			try {
				this.wait();//�u�{���� ���ݮ��O�̳q���Ͳ��Ѱ�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//�s�b�Ŷ��A�i�H�Ͳ�
		
		products[count]=product;
		count++;
		//�s�b�ƾڡA�i�H�q���c��
		this.notifyAll();
	}
	//�c��
	public synchronized Product sell() {
		//��ɥi�H�c��A�P�_�e���O�_�s�b�ƾ�
		
		//�S���ƾڡA�u������
		if(count==0) {
			try {
				this.wait();//�u�{����A���ݥͲ��̳q���i�H�c��F�A�Ѱ�����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//�s�b�ƾڥi�H���O
		count--;
		Product product=products[count];
		this.notifyAll();//�s�b�Ŷ��F�A������ݪ̥Ͳ�
		return product;
	}
	
}

//�ƾ�
class Product{
	private int id;
	
	public Product(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
