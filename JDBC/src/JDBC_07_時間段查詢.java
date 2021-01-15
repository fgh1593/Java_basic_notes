import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;




//PrepareStatement 處理大批數據時會占用太多預編譯空間，容易產生問題
//所以大批資料通常會使用 Statement
public class JDBC_07_時間段查詢 {
	public static void main(String[] args) {
		Connection conn=null;
		java.sql.PreparedStatement ps=null;
		java.sql.PreparedStatement ps2=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=CST&useSSL=false","root","leeroy1264");
			
			String sql="insert into time(id,DT) values(?,?)";
			
			
			conn.setAutoCommit(false);
			ps=conn.prepareStatement(sql);
			
			//批次增加時間數據
			for(int i=1;i<=1000;i++) {
				long x=(long) (Math.random()*10000*60*60*24*30);
				Date d= new Date((long) x+makeDateNumber("2020-10-01"));
				System.out.println((long) x+makeDateNumber("2020-10-01"));
				ps.setInt(1, i);
				ps.setDate(2, d);
				ps.addBatch();
				
			}
			ps.executeBatch();
			System.out.println("資料增加完成");
			
			conn.commit(); 
			
			//時間段查找
			String sql2="Select * from time where DT>? and DT<?";
			ps2=conn.prepareStatement(sql2);
			//起始時間
			Date starttime=new Date(makeDateNumber("2020-12-01"))  ;
			//結束時間
			Date endtime=new Date(makeDateNumber("2021-01-01"))  ;
			
			ps2.setDate(1, starttime);
			ps2.setDate(2, endtime);
			
			rs=ps2.executeQuery();
			
			while(rs.next()) {
				System.out.println("編號"+rs.getObject(1)+":"+rs.getObject(2));
			}
			
		} catch (ClassNotFoundException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
				ps2.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
	
	
	public static long makeDateNumber(String dateStr) {
		DateFormat formate=new SimpleDateFormat("yyyy-MM-dd");
		try {
			return formate.parse(dateStr).getTime();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}