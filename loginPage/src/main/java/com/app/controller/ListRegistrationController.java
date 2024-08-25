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

@WebServlet("/listAll")
public class ListRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListRegistrationController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOService service =new DAOServiceImpl();
		service.connectDB();
		
		ResultSet allReg = service.getAllReg();
		request.setAttribute("result", allReg);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/listAll.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
