package practice8_thread;

//靜態代理
//0.接口
//1.真實腳色
//2.代理腳色

//runnable接口與Thread也是一種靜態代理
public class JAVA300_201_靜態代理 {
	public static void main(String[] args) {
		new WeddingCompany(new Me()).happyMarry();
	}
}

//公共接口
interface Marry {
	void happyMarry();
}

//真實腳色
class Me implements Marry {

	@Override
	public void happyMarry() {
		System.out.println("要結婚囉");
	}
}

//代理腳色
class WeddingCompany implements Marry {
	private Marry target;

	private void 布置() {
		System.out.println("布置會場囉");
	}

	private void 撤場() {
		System.out.println("收拾環境囉");
	}

	public WeddingCompany(Marry target) {
		this.target = target;

	}

	public void happyMarry() {
		布置();
		target.happyMarry();
		撤場();
	}
}