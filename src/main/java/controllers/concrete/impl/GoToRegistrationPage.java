package controllers.concrete.impl;

import java.io.IOException;

import controllers.concrete.Command;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GoToRegistrationPage implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/reg.jsp");
		dispatcher.forward(request, response);
		
		
	}

}
