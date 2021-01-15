package IO_Study;

import java.io.File;

/*
 * 利用遞歸
 * 印出底下所有資料夾與檔案名稱
 */
public class DirDemo03 {

	public static void main(String[] args) {
		File dir = new File("D:/eclipse-workspace/Java300");
		printAllDir(dir,0);
	}

	public static void printAllDir(File dir,int deep) {
		for(int i=0;i<=deep;i++) {
			System.out.print("-");
		}
		
		System.out.println(dir.getName());
		
		if(dir ==null || !dir.isDirectory()) {
			return;
		}
		else if(dir.isDirectory()){
			for(File s:dir.listFiles()) {
				printAllDir(s,deep+1);
			}
		}
		
		
		
	}

}
