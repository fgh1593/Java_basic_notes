import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_01_��Ʈw�s�� {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			//�[���X����
			Class.forName("com.mysql.cj.jdbc.Driver");
			//�إ߳s��
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
				//�̫ᥲ���n����
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
