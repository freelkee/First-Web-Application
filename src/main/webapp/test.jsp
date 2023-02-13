<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Привет от Амиго</title>
</head>
<body>
<%--это еще HTML--%>
<%
    //А тут можно писать Java-код
    PrintWriter out1 = response.getWriter();
    String s = "Вся власть роботам!";
    for (int i = 0; i < 10; i++) {
        out1.println(s);
        out1.println("<br>");
    }

%>
<%--а это уже опять HTML--%>
</body>
</html>
