package com.chefspot.chefspot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lilyp on 15/05/2016.
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(Model model) {
        return "test";
    }
}