package com.book.www.controller;

import com.book.www.service.BookmanageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@Controller
public class BookManageController {
  @Resource
  BookmanageService bookmanageService;

  @GetMapping("/")
  public String index() {
    return "index";
  }
}
