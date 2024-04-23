package controllers.concrete.impl;

import java.io.IOException;

import bean.News;
import controllers.concrete.Command;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GoToIndexPage implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		News news = new News("New Java Course!!!", "safhsauhfsauifs", "");
		request.setAttribute("mainNews", news);
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main_index.jsp");
		dispatcher.forward(request, response);
		
	}
	
	

}
