package 線程;

//1.創建Thread+重寫run
public class JAVA300_196_StartThread extends Thread {
	
	//線程的入口點
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("打電動");
		}
	}
	
	public static void main(String[] args) {
		//創建子類對象
		JAVA300_196_StartThread st=new JAVA300_196_StartThread();
		//啟動線程
		st.start();//線程不保證立刻運行，將由CPU分配資源運行。
		
		// st.run()就單純調用方法 ，沒有線程效果
		
		for(int i=0;i<20;i++) {
			System.out.println("讀書");
		}
	}
}
