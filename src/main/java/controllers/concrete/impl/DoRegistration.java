package controllers.concrete.impl;

import java.io.IOException;

import controllers.concrete.Command;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DoRegistration implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("username " + request.getParameter("login"));
		System.out.println("username " + request.getParameter("username"));
		System.out.println("password " + request.getParameter("password"));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/main_index.jsp");
		dispatcher.forward(request, response);
		
	}

}
