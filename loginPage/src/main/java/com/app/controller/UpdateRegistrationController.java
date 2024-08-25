package com.app.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;

import com.app.model.*;

@WebServlet("/update")
public class UpdateRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateRegistrationController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("update do get method is running");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");

        System.out.println(email);
        System.out.println(mobile);

        request.setAttribute("email", email);
        request.setAttribute("mobile", mobile);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/updateReg.jsp");
        rd.forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");

        System.out.println("update do post method is running");
        System.out.println(email);
        System.out.println(mobile);

        DAOService service = new DAOServiceImpl();
        service.connectDB();
        service.updateReg(email, mobile);

        ResultSet allReg = service.getAllReg();
        request.setAttribute("result", allReg);
        request.setAttribute("updated", "Your Registration Is Updated!");
        System.out.println("registration updated");

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/listAll.jsp");
        rd.forward(request, response);
    }


}
