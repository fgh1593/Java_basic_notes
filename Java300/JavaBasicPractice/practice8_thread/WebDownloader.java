package practice8_thread;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class WebDownloader {
	
	public void Download(String url,String name) {
		try {
			FileUtils.copyURLToFile(new URL(url), new File(name));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println("此為非法路徑");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("下載異常");
		}
	}
}
