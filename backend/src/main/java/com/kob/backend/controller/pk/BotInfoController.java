package com.kob.backend.controller.pk;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getBotInfo/")
    public List<String> getbotinfo(){
        List<String> list = new LinkedList<>();
        list.add("apple");
        list.add("bannana");

        return list;
    }
}
