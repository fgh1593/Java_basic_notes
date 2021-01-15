package practice8_thread;

public class JAVA300_197_絬祘更瓜 extends Thread{
	
	private String url;
	private String name;
	
	public JAVA300_197_絬祘更瓜(String url, String name) {
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
		JAVA300_197_絬祘更瓜 a=new JAVA300_197_絬祘更瓜("https://p2.bahamut.com.tw/FORUM/welcome/07287_3_1584670159.JPG", "笆此.jpg");
		JAVA300_197_絬祘更瓜 b=new JAVA300_197_絬祘更瓜("https://media.playstation.com/is/image/SCEA/final-fantasy-vii-remake-listing-thumb-01-ps4-us-11jun19?$facebook$", "FF7.jpg");
		JAVA300_197_絬祘更瓜 c=new JAVA300_197_絬祘更瓜("https://p2.bahamut.com.tw/FORUM/welcome/30861_2_1588254754.JPG", "そ硈.jpg");
		
		a.start();
		b.start();
		c.start();
	}
}
