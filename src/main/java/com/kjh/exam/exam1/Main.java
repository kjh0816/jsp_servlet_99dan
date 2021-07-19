package com.kjh.exam.exam1;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/99dan.jsp")
public class Main extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		if(req.getParameter("dan") == null) {
			resp.getWriter().append("dan을 입력해주세요.");
			return;
		}
		
		if(req.getParameter("limit") == null) {
			resp.getWriter().append("limit을 입력해주세요.");
			return;
		}
		
		
		int dan = Integer.parseInt(req.getParameter("dan"));
		int limit = Integer.parseInt(req.getParameter("limit"));
		
		
		req.setAttribute("dan", dan);
		req.setAttribute("limit", limit);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/" +  "99dan.jsp");
		try {
			requestDispatcher.forward(req, resp);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
		
	}

       
   

}
