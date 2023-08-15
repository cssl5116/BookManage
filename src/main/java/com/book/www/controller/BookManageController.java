package com.book.www.controller;

import com.book.www.entity.Bookmanage;
import com.book.www.service.BookmanageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@Slf4j
public class BookManageController {
    @Resource
    BookmanageService bookmanageService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/add.html")
    public String fromAdd() {
        return "add";
    }

    @RequestMapping("/add")
    public String add(Bookmanage bookmanage) {
        if (bookmanageService.save(bookmanage)) {
            return "redirect:/";
        } else {
            return "redirect:/add";
        }
    }
}
