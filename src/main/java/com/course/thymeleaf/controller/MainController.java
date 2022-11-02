package com.course.thymeleaf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {


    @GetMapping("/home")
    public String loadHome(Model model){
        model.addAttribute("name","Thymeleaf");
        return "home";
    }
    @GetMapping("/elvis")
    public String elvisExample(Model model){
        /*
         *Elvis operator ?:
         * If unless
         * Switch case
         */
        model.addAttribute("isAdmin",false);
        model.addAttribute("gender","M");
        return "elvis";
    }

    @GetMapping("/each")
    public String eachExample(Model model){
        List<String> stringList = List.of("First","Second","Third");
        model.addAttribute("list",stringList);
        return "each";
    }


}
