package com.app.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;

import com.app.model.DAOService;
import com.app.model.DAOServiceImpl;

@WebServlet("/delete")
public class DeleteRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteRegistrationController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		DAOService service= new DAOServiceImpl();
		service.connectDB();
		service.deleteReg(email);
		
		ResultSet allReg = service.getAllReg();
		request.setAttribute("result", allReg);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/listAll.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
