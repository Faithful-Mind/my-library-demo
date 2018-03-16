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

/**
 * Created by Faithful-Mind on 2018/3/8.
 */
@WebServlet(name = "GetExampleBook", urlPatterns = {"/GetExampleBook.do"}, loadOnStartup = 1)
public class ExampleBorrowingBook extends HttpServlet {
    private ServletContext sCtx;

    @Override
    public void init() {
        this.sCtx = getServletContext();
        sCtx.setAttribute("hfPython", new Book("Head First Python", "O'Reilly", "9781449382674", Category.T, 0));
        sCtx.setAttribute("algs4", new Book("算法（英文版·第4版）", "人民邮电出版社", "9787115271464", Category.T, 1));
        sCtx.setAttribute("jzb", new Book("颈椎病康复指南", "湖北科学技术出版社", "9787535249340", Category.R, 2));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book actualBook = (Book) sCtx.getAttribute(req.getParameter("reqBook"));
        req.setAttribute("actualBook", actualBook);

        RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
        dispatcher.forward(req, resp);
    }
}
