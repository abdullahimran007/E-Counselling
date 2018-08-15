package package1;
import java.sql.*;
import java.sql.Statement;
public  final class Dbconnect {
	public static Statement getStatement()
	{
		Connection con=null;
		Statement st=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","abdullah","abdullah");
			st=con.createStatement();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return st;
	}



}
