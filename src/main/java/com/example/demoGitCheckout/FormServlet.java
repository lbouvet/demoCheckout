package com.example.demoGitCheckout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FromServlet", value = "/FromServlet")
public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/form.jsp");
        rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");

        System.out.println(prenom + " " + nom);

        doGet(request,response);
    }
}
