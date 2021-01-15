import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



//�@�� statement SQL�`�J ���@�w���I�ҥH����S�A�ϥΤF
//PrepareStatement �Ĳv���� ���I���C �@�볣�ϥγo�ؤ覡
public class JDBC_02_PrepareStatement_SQL�`�J {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=CST&useSSL=false","root","leeroy1264");
			System.out.println(conn);
			
			
			String sql="insert into �ǥ�(id) values(?)"; //?������šA�i�b����A�i���J�A�i�H�קK�`�J���I
			
			ps=conn.prepareStatement(sql);
			ps.setObject(1, "2"); //�s������ �e����1�N��Ĥ@��?  �᭱�N������
			ps.execute(); //�NSQL�y�y�B��
			
			//ps.executeUpdate() �C�X��s���ƶq
			int count = ps.executeUpdate();
			System.out.println(count);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//��}���n�������ATRYCATCH �������}��
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
