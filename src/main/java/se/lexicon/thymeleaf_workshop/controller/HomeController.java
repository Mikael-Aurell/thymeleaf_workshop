package se.lexicon.thymeleaf_workshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller // controllers are input handlers - all request will get in controller java classes first
public class HomeController {

    @RequestMapping("/")
    public String goToIndexPage(){
        System.out.println("####### goToIndexPage");
        return "index";
    }

    @GetMapping("/demo")
    public String demo(Model model){
        String welcomeMessage = "Welcome to my first web app";
        model.addAttribute("welcomeMessage",welcomeMessage);

        model.addAttribute("serverTime", LocalDateTime.now());

        String productName= "test";
        int price= 10000;
        LocalDate date = LocalDate.now();


        model.addAttribute("productName",productName);
        model.addAttribute("price",price);
        model.addAttribute("d",date);

        return "demo"; // returns html template based on file name
    }

}
