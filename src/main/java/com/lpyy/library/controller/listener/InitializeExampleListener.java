package com.lpyy.library.controller.listener;

import com.lpyy.library.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Map;

/**
 * Created by Faithful-Mind on 2018/3/17.
 */
@WebListener
@Component
public class InitializeExampleListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ApplicationContext appCtx = new AnnotationConfigApplicationContext(com.lpyy.library.ExampleConfig.class);
        Map<String, Book> booksMap = (Map<String, Book>) appCtx.getBean("booksMap");

        if (sce.getServletContext().getAttribute("booksMap") == null)
            sce.getServletContext().setAttribute("booksMap", booksMap);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
