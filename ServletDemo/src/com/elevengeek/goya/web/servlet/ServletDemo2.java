package com.elevengeek.goya.web.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author cj
 * @create 2020-02-13-14:59
 */
//@WebServlet(urlPatterns = "/demo")
@WebServlet("/demo")
public class ServletDemo2 extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}