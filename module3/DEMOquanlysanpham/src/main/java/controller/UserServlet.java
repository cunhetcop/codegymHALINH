package controller;

import model.User;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/userlist")
public class UserServlet extends HttpServlet {

    private service.UserService UserService;

    @Override
    public void init() throws ServletException {
        UserService = new UserService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("userinput");
        String password = req.getParameter("passinput");

        User users = UserService.findUserbyUsername(username,password);
        if (users!=null){
            resp.sendRedirect("/products");
        } else {
            req.setAttribute("taikhoan", username);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/homepage.jsp");
            dispatcher.forward(req,resp);
        }
    }
}
