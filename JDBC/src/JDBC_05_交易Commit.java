import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;




public class JDBC_05_交易Commit {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		PreparedStatement ps2=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=CST&useSSL=false","root","leeroy1264");
			
			//JDBC莫認為true自動提交，改成false即可手動提交
			conn.setAutoCommit(false);
			
			String sql="insert into 學生(id) values(?)"; 
			
			ps=conn.prepareStatement(sql);
			ps.setObject(1, "3"); 
			ps.execute(); 
			
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
			ps2=conn.prepareStatement(sql);
			//故意打錯
			ps2.setObject(2, "4"); 
			ps2.execute(); 
			
			conn.commit();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			try {
				
				//若中間發生錯誤則使用rollback取消所有指令
				conn.rollback();
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//後開的要先關掉，TRYCATCH 必須分開做
			try {
				ps2.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
