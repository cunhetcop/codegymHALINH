package controller.filter;

import model.User;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns = "/addProduct.jsp")
public class AdminFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("users");
        if (user == null) {
            res.sendRedirect("/login");
        } else if(user.getRole().equals("admin")){
            chain.doFilter(req,res);
        }
        else {
            PrintWriter printWriter = res.getWriter();
            printWriter.println("Không có quyền truy cập");
        }
    }
}