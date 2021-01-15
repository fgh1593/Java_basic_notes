package 線程;
//實現生產者消費者模型方法之一:管程法

public class JAVA300_222_多線程_併發協作cooperation_管程法 {
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

//生產者
class Productor extends Thread{
	SynContainer container;
	public Productor(SynContainer container) {
		this.container=container;
	}
	@Override
	public void run() {
		//生產
		for(int i=	1;i<=100;i++) {
			System.out.println("生產第"+i+"個商品");
			container.store(new Product(i));
		}
		
	}
}

//消費者
class Consumer extends Thread{
	SynContainer container;
	public Consumer(SynContainer container) {
		this.container=container;
	}
	@Override
	public void run() {
		//消費
		for(int i=0;i<100;i++) {
			System.out.println("消費第"+container.sell().getId()+"個商品");
			
		}
		
	}
}
//緩衝區
class SynContainer{
	Product[] products=new Product[10];
	//計數器
	int count=0;
	//存儲
	public synchronized void store(Product product) {
		//何時能生產，容器存在空間
		
		//不能生產
		if(count==products.length) {
			try {
				this.wait();//線程阻塞 等待消費者通知生產解除
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//存在空間，可以生產
		
		products[count]=product;
		count++;
		//存在數據，可以通知販賣
		this.notifyAll();
	}
	//販賣
	public synchronized Product sell() {
		//何時可以販賣，判斷容器是否存在數據
		
		//沒有數據，只有等待
		if(count==0) {
			try {
				this.wait();//線程阻塞，等待生產者通知可以販售了，解除阻塞
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//存在數據可以消費
		count--;
		Product product=products[count];
		this.notifyAll();//存在空間了，喚醒等待者生產
		return product;
	}
	
}

//數據
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
