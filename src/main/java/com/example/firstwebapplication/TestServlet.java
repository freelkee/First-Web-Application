package com.example.firstwebapplication;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//@WebServlet(name = "testServlet", value = "/test-servlet")
public class TestServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<h1> Hello, " + name + " " + surname + " </h1>");
        pw.println("</html>");
    }

    public void destroy() {
    }
}