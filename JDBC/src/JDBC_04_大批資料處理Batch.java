import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;




//PrepareStatement �B�z�j��ƾڮɷ|�e�ΤӦh�w�sĶ�Ŷ��A�e�����Ͱ��D
//�ҥH�j���Ƴq�`�|�ϥ� Statement
public class JDBC_04_�j���ƳB�zBatch {
	public static void main(String[] args) {
		Connection conn=null;
		java.sql.Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=CST&useSSL=false","root","leeroy1264");
			
			//�]����ʴ��檺�N�q�b��A��@�s�ꪺSQL�y�y���@�y���Ѫ��ܡA�h�������ѡA�]�����O�������ѴN�O�������\
			
			conn.setAutoCommit(false);//�]����ʴ���
			stmt=conn.createStatement();
			
			for(int i=1;i<=20000;i++) {
				stmt.addBatch("insert into batch(id,name) values("+i+",' "+i+"���� ')");
			}
			
			stmt.executeBatch();
			
			conn.commit(); //����ưȡA�b�����e��SQL�y�y�N�@�ִ���A�@�����ѫh��������
			
			
			
			
			
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
