package controllers.concrete.impl;

import java.io.IOException;

import controllers.concrete.Command;
import Logic.LogicStub;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DoAuth implements Command{
	private final LogicStub logic = new LogicStub();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		if(logic.checkAuth(login, password)) {
			
			request.setAttribute("invitationMessage", "Hello, user!");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/page.jsp");
			dispatcher.forward(request, response);
		}else {
			request.setAttribute("authError", "Wrong login or password");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main_index.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
