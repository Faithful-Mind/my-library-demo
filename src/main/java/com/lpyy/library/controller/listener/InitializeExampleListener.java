package com.lpyy.library.controller.listener;

import com.lpyy.library.model.Book;
import com.lpyy.library.model.Category;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by Faithful-Mind on 2018/3/17.
 */
@WebListener
public class InitializeExampleListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sCtx = sce.getServletContext();
        sCtx.setAttribute("hfPython", new Book("Head First Python", "O'Reilly", "9781449382674", Category.T, 0));
        sCtx.setAttribute("algs4", new Book("算法（英文版·第4版）", "人民邮电出版社", "9787115271464", Category.T, 1));
        sCtx.setAttribute("jzb", new Book("颈椎病康复指南", "湖北科学技术出版社", "9787535249340", Category.R, 2));
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
