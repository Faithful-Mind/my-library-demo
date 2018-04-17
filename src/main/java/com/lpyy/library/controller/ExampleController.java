package com.lpyy.library.controller;

import com.lpyy.library.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by Faithful-Mind on 2018/3/8.
 */
@Controller
@RequestMapping("/")
public class ExampleController {
    private Map<String, Book> booksMap;

    @Autowired
    public ExampleController(Map<String, Book> booksMap) {
        this.booksMap = booksMap;
    }

    @RequestMapping(value="/result")
    public String borrowBook(Model model) {
        model.addAttribute("booksMap", this.booksMap);
        return "result";
    }

    @RequestMapping(method=RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("booksMap", this.booksMap);
        return "example";
    }
}
