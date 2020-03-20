package com.uabc.edu.mx.examen.web;

import com.uabc.edu.mx.examen.model.Animal;
import com.uabc.edu.mx.examen.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/index")
public class AnimalController {

    @Autowired
    AnimalService service;

    @RequestMapping
    public String getAllData(Model model){
        List<Animal> list = service.getAllData();
        model.addAttribute("animal",list);
        return "index";
    }
}
