package practice5_io.file_and_path;

import java.io.File;

/*
 * 参璸ゅンЖ郎计秖ゅンЖ计秖
 */
public class DirDemo04 {
	public static void main(String[] args) {
		String path="D:/eclipse-workspace/Java300";
		CountDir d1=new CountDir(path);
		d1.printDir();
		
	}
}

class CountDir{
	private String path;
	private long size=0;
	private int dircount=-1;
	private int filecount=0;
	
	
	
	public CountDir(String path) {
		super();
		this.path = path;
		File dir=new File(path);
		this.countDir(dir);
		
	}



	private void countDir(File dir) {
		
		if(dir ==null || !dir.exists()) {
			return;
		}
		else if(dir.isDirectory()) {
			dircount++;
			for(File s:dir.listFiles()) {
				countDir(s);
				
			}
			
		}
		else if(dir.isFile()) {
			filecount++;
			size+=dir.length();
		}
	}
	
	public void printDir() {
		System.out.println("------------");
		System.out.println("戈Ж:"+this.size);
		System.out.println("戈Ж计秖:"+this.dircount);
		System.out.println("郎计秖:"+this.filecount);
		System.out.println("------------");
	}
	
}
