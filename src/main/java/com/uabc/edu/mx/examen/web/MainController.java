package com.uabc.edu.mx.examen.web;

import com.uabc.edu.mx.examen.model.Animal;
import com.uabc.edu.mx.examen.service.AnimalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    private AnimalService service;
    @RequestMapping
    public String home(){
        return "home";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }


}
