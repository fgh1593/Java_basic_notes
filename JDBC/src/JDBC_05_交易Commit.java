import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;




public class JDBC_05_���Commit {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		PreparedStatement ps2=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=CST&useSSL=false","root","leeroy1264");
			
			//JDBC���{��true�۰ʴ���A�令false�Y�i��ʴ���
			conn.setAutoCommit(false);
			
			String sql="insert into �ǥ�(id) values(?)"; 
			
			ps=conn.prepareStatement(sql);
			ps.setObject(1, "3"); 
			ps.execute(); 
			
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
			ps2=conn.prepareStatement(sql);
			//�G�N����
			ps2.setObject(2, "4"); 
			ps2.execute(); 
			
			conn.commit();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			try {
				
				//�Y�����o�Ϳ��~�h�ϥ�rollback�����Ҧ����O
				conn.rollback();
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//��}���n�������ATRYCATCH �������}��
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
