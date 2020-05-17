package jdbc;
import java.sql.*;

public class jdbc {
public static void  main(String args[])throws Exception

{
	String url="";
	String uname="";
	String pass="";
	Class.forName("com.mysql.jdbc.driver");
    Connection con=DriverManager.getConnection(url,uname,pass);
	
}
}
