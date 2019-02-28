package com.lti.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.service.DatabaseEmployee;
import com.lti.service.Employee;


@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		int empid=Integer.parseInt( req.getParameter("employee_id"));
		
		DatabaseEmployee employeeservice= new DatabaseEmployee();
		Employee emp=employeeservice.employeedata(empid);
		HttpSession session=req.getSession(); 
		session.setAttribute("employeedata",emp);
		resp.sendRedirect("Employeesdata.jsp");
		
	}
}
