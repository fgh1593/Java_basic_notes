package IO_Study03_裝飾器;

/*
 * 裝飾要素
 * 1.抽象組件:需要被裝飾的抽象物件(接口或父類)
 * 2.具體組件:需要被裝飾的物件
 * 3.抽象裝飾類:包含了對抽象組件的引用以及裝飾的共有方法
 * 4.具體裝飾類:拿來裝飾的物件
 * 
 * 以咖啡為例進行模擬
 */
public class DecorateTest {
	
	public static void main(String[] args) {
		Drink coffee=new Coffee();
		
		Suger suger=new Suger(coffee);
		System.out.println(suger.name());
		System.out.println(suger.cost());
		
		Milk milk=new Milk(suger);
		
		System.out.println(milk.name());
		System.out.println(milk.cost());
		
		
	}

}

//抽象組件 
interface Drink {
	String name();

	double cost();

}

//具體組件
class Coffee implements Drink {
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "原味咖啡";
	}

}

//抽象裝飾類
abstract class Decorate implements Drink {

	private Drink drink;

	public Decorate(Drink drink) {
		super();
		this.drink = drink;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return drink.name();
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return drink.cost();
	}
}
//具體裝飾類

class Milk extends Decorate {

	public Milk(Drink drink) {
		super(drink);
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return super.name() + "加牛奶";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost() + 10;
	}

}
class Suger extends Decorate {
	
	public Suger(Drink drink) {
		super(drink);
	}
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return super.name() + "加糖";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost() + 5;
	}
	
}
