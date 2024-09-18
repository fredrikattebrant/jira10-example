package com.atlassian.tutorial.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet{
    private static final Logger log = LoggerFactory.getLogger(MyServlet.class);

    private MyServlet() {
        System.out.println("+++ MyServlet - constructed");
    };

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");
        resp.getWriter().write("<html><body><i>Hello, World!</i></body></html>");
        System.out.println("+++ MyServlet - doGet called");
    }

}