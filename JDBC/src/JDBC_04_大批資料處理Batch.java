import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;




//PrepareStatement 處理大批數據時會占用太多預編譯空間，容易產生問題
//所以大批資料通常會使用 Statement
public class JDBC_04_大批資料處理Batch {
	public static void main(String[] args) {
		Connection conn=null;
		java.sql.Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=CST&useSSL=false","root","leeroy1264");
			
			//設為手動提交的意義在於，當一連串的SQL語句有一句失敗的話，則全部失敗，因此不是全部失敗就是全部成功
			
			conn.setAutoCommit(false);//設為手動提交
			stmt=conn.createStatement();
			
			for(int i=1;i<=20000;i++) {
				stmt.addBatch("insert into batch(id,name) values("+i+",' "+i+"號機 ')");
			}
			
			stmt.executeBatch();
			
			conn.commit(); //提交事務，在此之前的SQL語句將一併測驗，一旦失敗則全部失敗
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//後開的要先關掉，TRYCATCH 必須分開做
			try {
				if(rs!=null) {
				rs.close();
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				if(stmt!=null) {
				stmt.close();
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
