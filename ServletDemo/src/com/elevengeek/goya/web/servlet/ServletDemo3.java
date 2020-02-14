package com.elevengeek.goya.web.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author cj
 * @create 2020-02-13-14:59
 */
//@WebServlet(urlPatterns = "/demo")
@WebServlet({"/demo3","/demo33","/demo333"})
public class ServletDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        req.getRequestDispatcher("/demo3").forward(req,resp);
        ServletContext servletContext = req.getServletContext();
    }
}