<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Привет от Амиго</title>
</head>
<body>
<%--это еще HTML--%>
<%
    //А тут можно писать Java-код

    out.println("Сейчас : " + new Date());
    out.println("<br>");

    String s = "Вся власть роботам!";
    for (int i = 0; i < 10; i++) {
        out.println(s);
        out.println("<br>");
    }

%>
<%
    String image = request.getParameter("image");
    out.println("<img src=\"" + image + "\">");
%>

<%--а это уже опять HTML--%>
</body>
</html>
