package com.app.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import com.app.model.DAOService;
import com.app.model.DAOServiceImpl;

@WebServlet("/newReg")
public class NewRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NewRegController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/newReg.jsp");
        rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		DAOService service=new DAOServiceImpl();
		service.connectDB();
		service.saveReg(name, email, city, mobile);
		System.out.println("date saved to the database");
		request.setAttribute("saved", "Your data is saved!");
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/newReg.jsp");
		rd.forward(request, response);
		
		
	}

}
