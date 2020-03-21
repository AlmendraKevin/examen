package com.uabc.edu.mx.examen.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UsuarioController {
    @RequestMapping
    public String loginmain(){

        return "home";
    }
}
