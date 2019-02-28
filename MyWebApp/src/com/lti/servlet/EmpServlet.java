package com.lti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/emp.xls")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/vnd.ms-excel");
		PrintWriter out=response.getWriter();
		
		out.println("Empno\tName\tSalary");
		out.println("1001\tmanju\t100");
		out.println("1002\tsp\t24000");
		out.println("1004\txyz\t5000");
		out.println("1008\txyz\t5000");
		
	}

}
