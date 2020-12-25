package DataBaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample1 {

	public static void main(String[] args) throws SQLException {

     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl","hr","hr");
     Statement stmt=con.createStatement();
     //String s="insert into user values(104,'mecury','mercury2')";
     //String s="update users set uname='mer2' where userid=102";
     String s="delete users where userid=102";
     stmt.executeQuery(s);
     con.close();
     System.out.println("Program is existed");
     
		
	}

}
