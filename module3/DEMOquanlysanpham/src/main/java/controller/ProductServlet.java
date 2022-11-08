package controller;

import dao.CRUD_Product;
import service.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setAttribute("sanphams", CRUD_Product.getAll());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/showProduct.jsp");
        dispatcher.forward(req,resp);

        //cái này để ném sang trang khác nhưng là tạo ra request khác chứ ko kèm dữ liệu
        //resp.sendRedirect("/showProducts");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("sanphams", ProductService.products);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/showProduct.jsp");
        dispatcher.forward(req,resp);

        //cái này để ném sang trang khác nhưng là tạo ra request khác chứ ko kèm dữ liệu
        //resp.sendRedirect("/showProducts");
    }
}
