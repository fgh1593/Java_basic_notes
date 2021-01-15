import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;



//�@�� statement SQL�`�J ���@�w���I�ҥH����S�A�ϥΤF
//PrepareStatement �Ĳv���� ���I���C �@�볣�ϥγo�ؤ覡
public class JDBC_03_ResultSet {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=CST&useSSL=false","root","leeroy1264");
			System.out.println(conn);
			
			
			String sql="select * from rs where id>?;"; //?������šA�i�b����A�i���J�A�i�H�קK�`�J���I
			
			ps=conn.prepareStatement(sql);
			ps.setObject(1, "1"); //�s������ �e����1�N��Ĥ@��?  �᭱�N������
			
			//executeQuery�i�H���X ���G��   
			rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("id:"+rs.getObject(1)+"\nname:"+rs.getObject(2)+"\ninserttime:"+rs.getObject(3));
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//��}���n�������ATRYCATCH �������}��
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
