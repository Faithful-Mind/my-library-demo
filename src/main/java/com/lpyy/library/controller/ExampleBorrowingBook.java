package com.lpyy.library.controller;

import com.lpyy.library.model.Book;
import com.lpyy.library.model.Category;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Faithful-Mind on 2018/3/8.
 */
@WebServlet(name = "GetExampleBook", urlPatterns = {"/GetExampleBook.do"})
public class ExampleBorrowingBook extends HttpServlet {
    private ServletContext sCtx;

    @Override
    public void init() {
        this.sCtx = getServletContext();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
        dispatcher.forward(req, resp);
    }
}
