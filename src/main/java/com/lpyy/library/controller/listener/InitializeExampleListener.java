package com.lpyy.library.controller.listener;

import com.lpyy.library.model.Book;
import com.lpyy.library.model.Category;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.HashMap;

/**
 * Created by Faithful-Mind on 2018/3/17.
 */
@WebListener
public class InitializeExampleListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sCtx = sce.getServletContext();
        HashMap<String, Book> booksMap = new HashMap<>();
        booksMap.put("hfPython", new Book("Head First Python", "O'Reilly", "9781449382674", Category.T, 0));
        booksMap.put("algs4", new Book("算法（英文版·第4版）", "人民邮电出版社", "9787115271464", Category.T, 1));
        booksMap.put("jzb", new Book("颈椎病康复指南", "湖北科学技术出版社", "9787535249340", Category.R, 2));
        sCtx.setAttribute("booksLibrary", booksMap);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
