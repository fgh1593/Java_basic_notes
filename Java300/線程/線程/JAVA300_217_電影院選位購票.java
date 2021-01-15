package 線程;

import java.util.ArrayList;
import java.util.List;

public class JAVA300_217_電影院選位購票 {
	public static void main(String[] args) {
		Cinema 星光影城=new Cinema(10, "星光");
		System.out.println(星光影城.getAvailableSeat());
		Customer A=new Customer("A", 星光影城, new int[] {1,7});
		Customer B=new Customer("B", 星光影城, new int[] {8,3,2});
		Customer C=new Customer("C", 星光影城, new int[] {5,9});
		Customer D=new Customer("D", 星光影城, new int[] {10,1});
		Customer E=new Customer("E", 星光影城, new int[] {8,4});
		new Thread(C).start();
		new Thread(B).start();
		new Thread(A).start();
		new Thread(D).start();
		new Thread(E).start();
		
	}
	
}



class Cinema{
	String name;
	int seat;
	private List<Integer> availableSeat=new ArrayList<Integer>();
	
	public List<Integer> getAvailableSeat() {
		return availableSeat;
	}

	public void setAvailableSeat(List<Integer> availableSeat) {
		this.availableSeat = availableSeat;
	}

	public Cinema(int seat,String name) {
		this.seat=seat;
		this.name=name;
		for(Integer i=1;i<=seat;i++) {
			this.availableSeat.add(i);
		}
	}
}

class Customer implements Runnable{
	private String name;
	private int[] choosedseat;
	private List<Integer> myseat=new ArrayList<Integer>();
	Cinema c;
		
	public Customer(String name,Cinema c, int[] choosedseat) {
		super();
		this.name = name;
		this.choosedseat = choosedseat;
		this.c=c;
		for(int i=0;i<choosedseat.length;i++) {
			this.myseat.add(choosedseat[i]);
		}
	}


	@Override
	public void run() {
		buyTicket();
	}
	
	private void buyTicket() {
		List<Integer> copy=new ArrayList<Integer>();
		synchronized(c){
		copy.addAll(c.getAvailableSeat());
		copy.removeAll(myseat);
		if(c.getAvailableSeat().size()-copy.size()!=myseat.size()) {
			System.out.println(name+"購票失敗");
			return;
		}
		c.setAvailableSeat(copy);
		System.out.println(name+"購票成功，位置為"+myseat);
		System.out.println("剩餘"+c.getAvailableSeat().size()+"個位置");
		}
	}
	
	
}