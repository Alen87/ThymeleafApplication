package com.course.thymeleaf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping("/home")
    public String loadHome(Model model){
        model.addAttribute("name","Thymeleaf");
        return "home";
    }
    @GetMapping("/elvis")
    public String elvisExample(Model model){
        model.addAttribute("isAdmin",false);
        model.addAttribute("gender","M");
        return "elvis";
    }


    /*
    *Elvis operator ?:
    * If unless
    * Switch case
     */


}
