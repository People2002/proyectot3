package com.example.proyectot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rayosx")
public class RayosXController {
    @RequestMapping("/")
    public String examenMed(){
        return "servicios/rayosx";
    }
}
