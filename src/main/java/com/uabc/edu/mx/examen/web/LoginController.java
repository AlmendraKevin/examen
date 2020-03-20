package com.uabc.edu.mx.examen.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class LoginController {
    @RequestMapping
    public String loginmain(){

        return "login";
    }

}
