package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//访问链接，会首先找到@Controller，通过@Controller看是哪个函数，@RequestMapping对应的是indexController
//RequestMapping对应index(),index()返回一个字符串，代表一个html路径


@RequestMapping("/pk/")
public class indexController {
    @RequestMapping("index/") //注解

    public String index()
    {
        return "pk/index.html";
    }
}
