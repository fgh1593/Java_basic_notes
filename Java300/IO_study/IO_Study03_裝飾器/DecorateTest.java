package IO_Study03_�˹���;

/*
 * �˹��n��
 * 1.��H�ե�:�ݭn�Q�˹�����H����(���f�Τ���)
 * 2.����ե�:�ݭn�Q�˹�������
 * 3.��H�˹���:�]�t�F���H�ե󪺤ޥΥH�θ˹����@����k
 * 4.����˹���:���Ӹ˹�������
 * 
 * �H�@�ج��Ҷi�����
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

//��H�ե� 
interface Drink {
	String name();

	double cost();

}

//����ե�
class Coffee implements Drink {
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "����@��";
	}

}

//��H�˹���
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
//����˹���

class Milk extends Decorate {

	public Milk(Drink drink) {
		super(drink);
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return super.name() + "�[����";
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
		return super.name() + "�[�}";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost() + 5;
	}
	
}
