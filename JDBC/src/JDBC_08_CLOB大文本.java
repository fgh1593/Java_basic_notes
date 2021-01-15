import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//可以利用CLOB 配合 SQL的text屬性
//較少用，通常會直接用文件儲存

public class JDBC_08_CLOB大文本 {
	public static void main(String[] args) throws FileNotFoundException {
		Connection conn=null;
		PreparedStatement ps=null;
		PreparedStatement ps2=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=CST&useSSL=false","root","leeroy1264");
			System.out.println(conn);
			
			
			String sql="insert into clob(id,info) values(?,?)"; 
			
			ps=conn.prepareStatement(sql);
			ps.setObject(1, "1");
			//將txt輸入SQL
			ps.setClob(2, new FileReader(new File("我是文本.txt")));
			ps.execute(); 
			
			ps2=conn.prepareStatement(sql);
			
			ps2.setObject(1, "2");
			//將String輸入文本
			ps2.setClob(2, new BufferedReader(new InputStreamReader(new ByteArrayInputStream("asascqeqd".getBytes()))));
			ps2.execute(); 
			
			
			
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
