package com.example.springdemo.controller;

import com.example.springdemo.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class CommonController {
    @Autowired
    public CommonService commonService;
    @RequestMapping(value = "/",method = {RequestMethod.POST,RequestMethod.GET})
    public String login(){
        return "login...";
    }

    @RequestMapping(value = "/loginPage",method = {RequestMethod.POST,RequestMethod.GET})
    public String login(HttpServletRequest request, HttpSession session){
        String sno=request.getParameter("sno");
        String password=request.getParameter("password");

        System.out.println("你输入的学号为："+sno);
        System.out.println("你输入的密码为："+password);

        String name=commonService.login(sno,password);

        session.setAttribute("name",name);

        return commonService.login(sno,password);

    }

}
