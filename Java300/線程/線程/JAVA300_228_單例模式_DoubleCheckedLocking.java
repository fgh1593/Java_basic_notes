package 線程;

//DCL單例模式:在多線程環境下，對外僅存在一個物件
//1.構造器私有化-->避免外部new構造器
//2.提供私有的靜態屬性-->儲存物件的地址
//3.提供公共的靜態方法-->獲取屬性
public class JAVA300_228_單例模式_DoubleCheckedLocking {
	// 2.提供私有的靜態屬性，加入volatile避免重排現象and即時更新數據內容，避免錯誤
	//沒有volatile，其他線程可能訪問一個還未初始化的對象
	private volatile static JAVA300_228_單例模式_DoubleCheckedLocking instance;

	// 1.構造器私有化
	private JAVA300_228_單例模式_DoubleCheckedLocking() {
	}
	// 3.提供公共的靜態方法-->獲取屬性

	

	public static JAVA300_228_單例模式_DoubleCheckedLocking getInstance() {
		//加入雙重檢測提高效率，在已經存在對象時，避免不必要的同步
		if (null != instance) {
			return instance;
		}
		//在創建對象的class設計圖上鎖
		synchronized (JAVA300_228_單例模式_DoubleCheckedLocking.class) {
			if (null == instance) {
				instance = new JAVA300_228_單例模式_DoubleCheckedLocking();
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		new Thread(()->{
			System.out.println(getInstance());
		}
		).start();
		System.out.println(getInstance());
	}

}
