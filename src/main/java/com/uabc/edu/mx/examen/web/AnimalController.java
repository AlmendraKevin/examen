package com.uabc.edu.mx.examen.web;

import com.uabc.edu.mx.examen.model.Animal;
import com.uabc.edu.mx.examen.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thymeleaf.model.IModel;

import java.util.List;

@Controller
@RequestMapping("/data")
public class AnimalController {

    @Autowired
    AnimalService service;

    @RequestMapping("/info")
    public String getAllData(Model model){
        List<Animal> list = service.getAllData();
        model.addAttribute("animal",list);
        return "index";
    }

    @RequestMapping(path = "/save",method = RequestMethod.POST)
    public String createAnimal(Animal ani){
        service.createAnimal(ani);
        return "redirect:/";
    }

    @RequestMapping("/formCreate")
    public String createAnimal(Model model){
        model.addAttribute("animal",new Animal());
        return "formCreate";
    }

}
