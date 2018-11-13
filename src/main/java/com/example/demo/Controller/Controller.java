package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String mainPage(){
        return "mainPage";
    }

    @GetMapping("/about")
    public String aboutPage(){
        return "aboutPage";
    }

    @GetMapping("/games")
    public String gamesPage(){
        return "gamesPage";
    }

    @GetMapping("/contact")
    public String contactPage(){
        return"contactPage";

    }
}
