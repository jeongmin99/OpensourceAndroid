package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class test {

	
	public static void main(String[] args) throws SQLException {
		 Connection con=null;
		 String id="hi";
		 String passwd="hello";
		 final String URL="jdbc:mysql://endpoint/";
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(URL,"conid","conpasswd");
			
		} catch (ClassNotFoundException e) {
			System.out.println("fail");
		}
		 
		 String sql="insert into Test.user values(?,?)";
		 PreparedStatement pstmt=con.prepareStatement(sql);
		 
		 pstmt.setString(1,id);
		 pstmt.setString(2,passwd);
		 pstmt.executeUpdate();
		 
	}
}
