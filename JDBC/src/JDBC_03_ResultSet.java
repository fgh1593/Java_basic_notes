import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;



//一般 statement SQL注入 有一定風險所以比較沒再使用了
//PrepareStatement 效率較高 風險較低 一般都使用這種方式
public class JDBC_03_ResultSet {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=CST&useSSL=false","root","leeroy1264");
			System.out.println(conn);
			
			
			String sql="select * from rs where id>?;"; //?為佔位符，可在之後再進行輸入，可以避免注入風險
			
			ps=conn.prepareStatement(sql);
			ps.setObject(1, "1"); //編輯佔位符 前面的1代表第一個?  後面代表它的直
			
			//executeQuery可以取出 結果集   
			rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("id:"+rs.getObject(1)+"\nname:"+rs.getObject(2)+"\ninserttime:"+rs.getObject(3));
			}
			
			
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
