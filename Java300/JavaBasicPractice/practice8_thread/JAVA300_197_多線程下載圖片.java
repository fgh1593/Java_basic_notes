package practice8_thread;

public class JAVA300_197_�h�u�{�U���Ϥ� extends Thread{
	
	private String url;
	private String name;
	
	public JAVA300_197_�h�u�{�U���Ϥ�(String url, String name) {
		super();
		this.url = url;
		this.name = name;
	}

	@Override
	public void run() {
		WebDownloader wd=new WebDownloader();
		wd.Download(url, name);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		JAVA300_197_�h�u�{�U���Ϥ� a=new JAVA300_197_�h�u�{�U���Ϥ�("https://p2.bahamut.com.tw/FORUM/welcome/07287_3_1584670159.JPG", "�ʴ�.jpg");
		JAVA300_197_�h�u�{�U���Ϥ� b=new JAVA300_197_�h�u�{�U���Ϥ�("https://media.playstation.com/is/image/SCEA/final-fantasy-vii-remake-listing-thumb-01-ps4-us-11jun19?$facebook$", "FF7.jpg");
		JAVA300_197_�h�u�{�U���Ϥ� c=new JAVA300_197_�h�u�{�U���Ϥ�("https://p2.bahamut.com.tw/FORUM/welcome/30861_2_1588254754.JPG", "���s.jpg");
		
		a.start();
		b.start();
		c.start();
	}
}
