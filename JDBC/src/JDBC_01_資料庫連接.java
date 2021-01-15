import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_01_資料庫連接 {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			//加載驅動類
			Class.forName("com.mysql.cj.jdbc.Driver");
			//建立連接
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=GMT%2B8&useSSL=false","root","leeroy1264");
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//最後必須要關閉
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
