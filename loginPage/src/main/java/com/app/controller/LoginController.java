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

@WebServlet("/login")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Redirect to login page if accessed via GET
        response.sendRedirect("login.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        System.out.println("Entered email: " + email);
        System.out.println("Entered password: " + password);

        DAOService service = new DAOServiceImpl();
        service.connectDB();
        
        boolean status = service.verifycredentials(email, password);
        if (status) {
            System.out.println("Your password is correct");
            
            RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/newReg.jsp");
            rd.forward(request, response);
        } else {
            System.out.println("Invalid credentials");
            request.setAttribute("error", "Invalid Username/Password");
            
            //if password or username incorrect then redirect to the login.jsp page
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
        }
    }
}
