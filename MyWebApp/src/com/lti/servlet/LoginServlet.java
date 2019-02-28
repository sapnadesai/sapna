package com.lti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.service.DatabaseLoginService;


@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		
		DatabaseLoginService loginservice= new DatabaseLoginService();
		String fullname= loginservice.isValidUser(username,password);
				
		HttpSession session=request.getSession(); 
		
				if(fullname!=null) {
				session.setAttribute("loggedinuser",fullname);
					response.sendRedirect("welcome.jsp");
				}
				else {
					session.setAttribute("message" , "invalid username/password");
					response.sendRedirect("Logins.jsp");      
				}
	}
}
