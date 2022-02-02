package com.connection.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.pro.DBConnection;
@WebServlet("/log")
public class product extends HttpServlet {
	


	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String url = "jdbc:mysql://localhost:3306/product";
		String username = "root";
		String password = "root123";
		boolean st=false;

		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		try {
			DBConnection db=new DBConnection (url,username,password);
			Connection connection =db.getConnection();
			 
			 Statement st1= connection.createStatement();
			
			 
//			 if(true) {
ResultSet set=	 st1.executeQuery("select * from product_29 where name=16");
//		//out.println("data sucessfully feached");
//			 
	while(set.next())
			{
		int name=set.getInt("name");
			String place=set.getNString("place");
			out.println(name+" "+place+" "+"<br/>");
		out.println("data sucessfully feached");
			}
			
		st1.close();
		out.println("</body></html>");
		db.closeConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	

}