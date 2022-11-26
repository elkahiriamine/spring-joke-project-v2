package com.example.springjokeprojectv2.controllers;


import com.example.springjokeprojectv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerJoke {

    private final JokeService jokeService;


    public ControllerJoke(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping(value = {"","/"},method = RequestMethod.GET)
    public String getJoke(Model model){
        model.addAttribute("tellJoke",jokeService.getJoke());
        return "index";
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addJoke(Model model){

        return "adding";
    }



}
