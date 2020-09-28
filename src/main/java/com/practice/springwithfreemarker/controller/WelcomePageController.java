package com.practice.springwithfreemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Nawa
 * on 9/28/20.
 * (c)Marathon Computer Systems
 */

@Controller
public class WelcomePageController {
    @GetMapping({"/", "/hello"})
    public String hello(Model model) {
        System.out.println(model.getClass().getSimpleName());
        model.addAttribute("name", "nawa");
        return "login";
    }
}
