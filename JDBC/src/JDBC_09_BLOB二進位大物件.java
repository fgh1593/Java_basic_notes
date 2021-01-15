import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

//可以利用BLOB 配合 SQL的BLOB屬性
//輸入輸出 常會使用IO流

public class JDBC_09_BLOB二進位大物件 {
	public static void main(String[] args) throws IOException {
		Connection conn=null;
		PreparedStatement ps=null;
		PreparedStatement ps2=null;
		ResultSet rs=null;
		InputStream is=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=CST&useSSL=false","root","leeroy1264");
			System.out.println(conn);
			
			
			String sql="insert into blobtest (id,headimg)  values (?,?)"; 
			
			ps=conn.prepareStatement(sql);
			ps.setInt(1, 1);
			ps.setBlob(2, new FileInputStream("D:/eclipse-workspace/JDBC/aaa.png"));
			ps.execute(); 
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			
			
			try {
				if(ps!=null) {
				ps.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				if(conn!=null) {
				conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
