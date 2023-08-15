package com.book.www.controller;

import com.book.www.entity.Bookmanage;
import com.book.www.service.BookmanageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Slf4j
public class BookManageController {
    @Resource
    BookmanageService bookmanageService;

    @RequestMapping("/select")
    @ResponseBody
    public List<Bookmanage> select() {
        return bookmanageService.list();
    }
    @GetMapping("/")
    public String index() {
        return "select";
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
