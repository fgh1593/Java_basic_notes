package IO_Study;

import java.io.File;

/*
 * �Q�λ��k
 * �L�X���U�Ҧ���Ƨ��P�ɮצW��
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
