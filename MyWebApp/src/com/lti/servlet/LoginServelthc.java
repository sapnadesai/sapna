package com.lti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServelt")
public class LoginServelthc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(username.equals("sapnapooja") && password.equals("hello"))
	        out.println("successfull");
            else
         out.println("invalid username/password");
            
	}
	

}
