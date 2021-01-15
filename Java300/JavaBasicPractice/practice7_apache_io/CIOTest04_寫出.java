
package practice7_apache_io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class CIOTest04_寫出 {
	public static void main(String[] args) throws IOException {
		FileUtils.write(new File("CIOTest.txt"), "動森太好玩了\n","MS950");
		FileUtils.writeStringToFile(new File("CIOTest.txt"), "害我不讀書\n","MS950",true);
		//true 為是否接續
		FileUtils.writeByteArrayToFile(new File("CIOTest.txt"), "好煩惱啊\n".getBytes("MS950"), true);
		
		//寫出列表
		List<String> datas=new ArrayList<String>();
		datas.add("動物森友會");
		datas.add("FF7");
		datas.add("伊蘇");
		
		FileUtils.writeLines(new File("CIOTest.txt"), datas, ".@.",true);
		
		//".@."為每筆數據句尾加入之間隔符號
	}
}
