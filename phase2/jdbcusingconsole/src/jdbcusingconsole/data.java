package jdbcusingconsole;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class data  {
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/product","root","root123");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from product_29");  
		while(rs.next())  
		System.out.println( rs.getInt("name")+""+rs.getString("place"));
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  
		}  

