package com.example.proyectot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/serviciosdash")
public class ServiciosDashController {
    
    @RequestMapping("/adomicilio")
    public String domicilio(){
        return "serviciosdash/adomicilio";
    }

    @RequestMapping("/sede")
    public String sede(){
        return "serviciosdash/sede";
    }
}
