<%--
  Created by IntelliJ IDEA.
  User: freelkee
  Date: 14.02.2023
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
    <title>Show cart</title>
    </head>
    <body>
        <%@ page import="com.example.firstwebapplication.Cart" %>
        <% Cart cart = (Cart) session.getAttribute("cart"); %>
        <p> Наименование: <%= cart.getName()%> </p>
        <p> Количество: <%= cart.getQuantity()%> </p>
    </body>
</html>
