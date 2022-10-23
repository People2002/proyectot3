package com.example.proyectot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/serviciosdash")
public class SedeController {
    
    @RequestMapping("/sede")
    public String inicio(){
        return "serviciosdash/sede";
    }
}
