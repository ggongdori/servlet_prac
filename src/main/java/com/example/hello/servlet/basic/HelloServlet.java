package com.example.hello.servlet.basic;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet {

    @Override
    protected void Service(HttpServletRequest req, HttpServletResponse response) throws ServletException {

    }

}
