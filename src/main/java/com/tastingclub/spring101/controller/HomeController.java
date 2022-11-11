package com.tastingclub.spring101.controller;


import com.tastingclub.spring101.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;


@Controller
public class HomeController {

/*  @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
      return "home/index";
    }
    */

    @GetMapping("/")
  public String index(){
    return "home/index";
    }

    @PostMapping("/personData")
  public String personData(@ModelAttribute Person person, Model model){
      model.addAttribute("Person", person);

      return "home/personData";
    }

}