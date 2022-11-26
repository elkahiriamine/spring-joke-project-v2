package com.example.springjokeprojectv2.controllers;


import com.example.springjokeprojectv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerJoke {

    private final JokeService jokeService;


    public ControllerJoke(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"","/"})
    public String getJoke(Model model){
        model.addAttribute("tellJoke",jokeService.getJoke());
        return "index";
    }

}
