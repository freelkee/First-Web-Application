package com.example.firstwebapplication;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//@WebServlet(name = "testServlet", value = "/test-servlet")
public class TestServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        Cart cart = (Cart) session.getAttribute("card");

        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        if(cart == null){
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);
        }
        session.setAttribute("cart",cart);


        Integer count = (Integer) session.getAttribute("count");
        if(count == null) {
            session.setAttribute("count", 1);
            count = 1;
        }
        else
            session.setAttribute("count",count + 1);
        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request,response);


//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");
        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<h1> Your count is " + count + "</h1>");
//        pw.println("<h1> Hello, " + name + " " + surname + " </h1>");
        pw.println("</html>");

//        response.sendRedirect("https://www.google.com");
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/test.jsp");
//        dispatcher.forward(request,response);
    }

    public void destroy() {
    }
}