package SQL;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
/*
 *
 */
import java.sql.*;
import java.util.Enumeration;
public class MyJDBC {
	public Connection con;
	/*
	 * 나는 누군가가 이 클래스를 new 시키는 순간
	 * 가장 필요한 드라이버 로딩과 커넥션을 동시에 실행하겠다.
	 */
	public MyJDBC() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			con = DriverManager.getConnection(url, "scott", "tiger");
		}
		catch(Exception e1){
			e1.printStackTrace();
		}
	}
	
	public Statement getSTMT(){
		Statement stmt = null ;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}
		catch (Exception e2){
			e2.printStackTrace();
		}
		return stmt;
	}
	public PreparedStatement getPSTMT(String sql){
		// 질의 명령을 알아야 한다.
		PreparedStatement pstmt = null ;
		try{
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}
		catch (Exception e3){
			e3.printStackTrace();
		}
		return pstmt;
	}
	
	// 닫을 내용은 한개가 아니다.
	public void close(Object o){
		// 닫아야 되는 것이 여러개 이므로 상위 클래스로 받아서 형변환해서 사용....
		try{
			if ( o instanceof Connection){
				((Connection) o).close();
			}
			else if ( o instanceof Statement){
				((Statement) o).close();
			}
			else if( o instanceof PreparedStatement){
				((PreparedStatement) o).close();
			}
			else if(o instanceof ResultSet){
				((ResultSet) o).close();
			}
		}
		catch(Exception e5){
			e5.printStackTrace();
		}
	}

//	public static void main(String[] args) {
//		new MyJDBC();
//	}

}
