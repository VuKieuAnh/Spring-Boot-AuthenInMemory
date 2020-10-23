package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping()
    public ModelAndView index1(){
        ModelAndView modelAndView = new ModelAndView("user1");
        return modelAndView;
    }
}
