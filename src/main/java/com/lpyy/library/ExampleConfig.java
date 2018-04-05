package com.lpyy.library;

import com.lpyy.library.model.Book;
import com.lpyy.library.model.Category;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Faithful-Mind on 2018/3/26.
 */
@Configuration
@ComponentScan(basePackages = "com.lpyy.library.controller")
public class ExampleConfig {

    @Bean(name = "booksMap")
    public Map<String, Book> booksMap() {
        Map<String, Book> booksMap = new HashMap<>();
        booksMap.put("hfPython", new Book("Head First Python", "O'Reilly", "9781449382674", Category.T, 0));
        booksMap.put("algs4", new Book("算法（英文版·第4版）", "人民邮电出版社", "9787115271464", Category.T, 1));
        booksMap.put("jzb", new Book("颈椎病康复指南", "湖北科学技术出版社", "9787535249340", Category.R, 2));
        return booksMap;
    }

}
