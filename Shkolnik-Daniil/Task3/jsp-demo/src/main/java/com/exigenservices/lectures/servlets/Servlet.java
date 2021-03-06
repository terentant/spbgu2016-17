package com.exigenservices.lectures.servlets;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/start.jsp");
        rd.forward(req, res);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/start.jsp");
        rd.forward(req, res);
    }
}