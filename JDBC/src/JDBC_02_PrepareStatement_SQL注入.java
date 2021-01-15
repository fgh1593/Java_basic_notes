import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



//一般 statement SQL注入 有一定風險所以比較沒再使用了
//PrepareStatement 效率較高 風險較低 一般都使用這種方式
public class JDBC_02_PrepareStatement_SQL注入 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=CST&useSSL=false","root","leeroy1264");
			System.out.println(conn);
			
			
			String sql="insert into 學生(id) values(?)"; //?為佔位符，可在之後再進行輸入，可以避免注入風險
			
			ps=conn.prepareStatement(sql);
			ps.setObject(1, "2"); //編輯佔位符 前面的1代表第一個?  後面代表它的直
			ps.execute(); //將SQL語句運行
			
			//ps.executeUpdate() 列出更新的數量
			int count = ps.executeUpdate();
			System.out.println(count);
			
			
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
