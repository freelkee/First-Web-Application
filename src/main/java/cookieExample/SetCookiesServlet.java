package cookieExample;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie1 = new Cookie("some_id","123");
        Cookie cookie2 = new Cookie("some_name","Jack");

        cookie1.setMaxAge(24 * 60 * 60);
        cookie2.setMaxAge(24 * 60 * 60);

        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
