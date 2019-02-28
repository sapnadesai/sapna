package com.lti.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DatabaseEmployee
{
	public Employee employeedata(int employee_id)
	{
	 Connection conn=null;
	  PreparedStatement  ps=null;
	  ResultSet rs=null;
	   try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe ", "hr", "Newuser123");
		String sql= "select "
				+ "employee_id, first_name, last_name, hire_date, "
				+ "salary,phone_number from employees where employee_id= ? " ;
		
		ps=conn.prepareStatement(sql);
		ps.setInt(1,employee_id);
		
		rs=ps.executeQuery();
		if(rs.next())
		{  
			Employee emp= new Employee();
			emp.setEmployeeid(employee_id);
			emp.setFirstName(rs.getString(1));
			emp.setLastName(rs.getString(2));
			emp.setEmail(rs.getString(3));
			emp.setPhoneNumber(rs.getString(4));
			emp.setHireDate(rs.getString(5));
			emp.setSalary(rs.getDouble(6));
			return emp;
		}
		else
			return null;
	     }  
	    catch (Exception e)  
	    {
		e.printStackTrace();
		return null;
	    }
	    finally {
	    	try{rs.close();}catch(Exception e) {}
	    	try {ps.close();}catch(Exception e) {}
	    	try {conn.close();}catch(Exception e) {}
	    	}  
	}	
	    
	
}