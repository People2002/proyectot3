package com.example.proyectot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NosotrosController {
    @RequestMapping("/nosotros")
    public String nosotros(){
        return "nosotros";
    }
}
