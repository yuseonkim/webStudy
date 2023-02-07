package pr06.ex01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class loginServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("init 메소드 호출");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user_id = req.getParameter("user_id");
        String user_pw = req.getParameter("user_pw");
        System.out.println("아이디 : " + user_id);
        System.out.println("패스워드 : " + user_pw);

    }

    @Override
    public void destroy() {
        System.out.println("destroy 메소드 호출");
    }
}
