package Controllers;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

import Logic.LogicStub;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final LogicStub logic = new LogicStub();
	
	public Controller() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doRequest(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doRequest(request, response);
	}

private void doRequest(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
	
	String command = request.getParameter("command");
	// TODO Auto-generated method stub
	switch(command) {
	case "auth":
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		if(logic.checkAuth(login, password)) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/page.jsp");
			dispatcher.forward(request, response);
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response); 
		}
		break;
	case "registration":
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/reg.jsp");
		dispatcher.forward(request, response);
		break;
	case "new_user_registration":
		System.out.println("Login: " + request.getParameter("login"));
		System.out.println("Username: " + request.getParameter("username"));
		System.out.println("Password: " + request.getParameter("password"));
		dispatcher = request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
		break;
	}
		
}	
}
