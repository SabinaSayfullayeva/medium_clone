package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public String home(){
        return "home";
    }

    @GetMapping("/home")
    public String homePage(){
        return "home";
    }

    @GetMapping("/articles")
    public String articles(){
        return "articles";
    }
    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
