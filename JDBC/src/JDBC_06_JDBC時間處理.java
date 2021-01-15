import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.mysql.cj.protocol.Resultset;



public class JDBC_06_JDBC時間處理 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=GMT%2B8&useSSL=false","root","leeroy1264");
			
			//使用java.sql.包內的DATE 對應 MYSQL的DATE
			java.sql.Date date=new Date(System.currentTimeMillis());
			//使用java.sql.包內的Timestamp 對應 MYSQL的 Timestamp
			Timestamp ts=new Timestamp(System.currentTimeMillis());
			
			
			String sql="insert into time(id,DT,TS) values(?,?,?);"; 
			
			ps=conn.prepareStatement(sql);
			ps.setObject(1, "1"); 
			ps.setObject(2, date); 
			ps.setObject(3, ts); 
			
			ps.execute();
			
		
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//後開的要先關掉，TRYCATCH 必須分開做
			
			
			
			try {
				if(ps!=null) {
				ps.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			try {
				if(conn!=null) {
				conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
