package com.lti.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseLoginService {

	public String isValidUser(String username, String password) 
	{
	  Connection conn=null;
	  PreparedStatement  ps=null;
	  ResultSet rs=null;
	    try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe ", "hr", "Newuser123");
		//String sql="select count(1) from tbl_user where  username=? and password =?  and active='Y' ";
		String sql="select fullname from tbl_user where username=? and password =?  and active='Y' ";
		ps=conn.prepareStatement(sql);
		ps.setString(1,username);
		ps.setString(2,password);
		
		rs=ps.executeQuery();
		if(rs.next())
		{ 
			String fullname=rs.getString("fullname");
			return fullname;
		}
		else
			return null;
		
	     }  
	    
	    catch (SQLException e)  // should catch individual exception(s)
	    {
		e.printStackTrace();//very bad,should 
		return null;
	    }
  catch (ClassNotFoundException e)  // should catch individual exception(s)  
	    {
		e.printStackTrace();//very bad,should 
		return null;
	    }
	    finally {
	    	try{rs.close();}catch(Exception e) {}
	    	try {ps.close();}catch(Exception e) {}
	    	try {conn.close();}catch(Exception e) {}
	    	}  
	}	
	    
}
		
	
	
	


