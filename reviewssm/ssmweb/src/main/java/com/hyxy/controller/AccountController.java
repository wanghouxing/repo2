package com.hyxy.controller;

import com.hyxy.pojo.Account;
import com.hyxy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("findAll")
    public ModelAndView find(){
        ModelAndView mv=new ModelAndView();
        List<Account> accountList = accountService.findAll();
        mv.addObject("accountlist",accountList);
        mv.setViewName("success");
        return mv;
    }
}
