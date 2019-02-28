package com.lti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/hello.php")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html"); //setting of MIME
		PrintWriter out=response.getWriter();
		
		out.println("<html><body>");
		out.println("<h2><i>Hello from servlet</i></h2>");
		out.println("<h2><p style=\"color:red;\">Welcome to LTI</p></h2>");
		out.println("</body></html>");
		}

}
