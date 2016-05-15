package com.chefspot.chefspot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lilyp on 30/04/2016.
 */
@Controller
public class HomePageController {

    @RequestMapping("/")
    public String welcome(Model model) {
        //model.addAttribute("greeting", "Welcome");
        //model.addAttribute("tagline", "Less processing for healthy living");
        return "welcome";
    }
}
