package practice8_thread;

//�R�A�N�z
//0.���f
//1.�u��}��
//2.�N�z�}��

//runnable���f�PThread�]�O�@���R�A�N�z
public class JAVA300_201_�R�A�N�z {
	public static void main(String[] args) {
		new WeddingCompany(new Me()).happyMarry();
	}
}

//���@���f
interface Marry {
	void happyMarry();
}

//�u��}��
class Me implements Marry {

	@Override
	public void happyMarry() {
		System.out.println("�n���B�o");
	}
}

//�N�z�}��
class WeddingCompany implements Marry {
	private Marry target;

	private void ���m() {
		System.out.println("���m�|���o");
	}

	private void �M��() {
		System.out.println("���B�����o");
	}

	public WeddingCompany(Marry target) {
		this.target = target;

	}

	public void happyMarry() {
		���m();
		target.happyMarry();
		�M��();
	}
}