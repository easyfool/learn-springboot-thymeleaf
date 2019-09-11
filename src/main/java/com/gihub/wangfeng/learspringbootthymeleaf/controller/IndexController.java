package com.gihub.wangfeng.learspringbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "views/index";
    }

    @RequestMapping("/test")
    public String test() {
        return "views/test";
    }
}
