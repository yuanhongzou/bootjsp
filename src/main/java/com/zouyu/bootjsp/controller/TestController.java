package com.zouyu.bootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @RequestMapping("/index")
    public String sayHello(HttpServletRequest request){
        request.setAttribute("hello","hello world!");
        return "index";
    }

}
