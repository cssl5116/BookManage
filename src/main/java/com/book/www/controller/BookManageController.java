package com.book.www.controller;

import com.book.www.entity.Bookmanage;
import com.book.www.service.BookmanageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@Slf4j
public class BookManageController {
    @Resource
    BookmanageService bookmanageService;

    @RequestMapping("/select")
    @ResponseBody
    public List<Bookmanage> select() {
        List<Bookmanage> list = bookmanageService.list();
        System.out.println(list);
        return list;
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
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, HttpServletRequest request){
        String msg=bookmanageService.removeById(id)?"删除成功":"删除失败";
        request.getSession().setAttribute("msg",msg);
        return "redirect:/result.html";
    }
    @GetMapping("/result.html")
    public String toResult() {
        return "result";
    }
}
