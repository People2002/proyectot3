package com.example.proyectot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/servicios")
public class ServiciosController {
    
    @RequestMapping("/rayosx")
    public String examenMed(){
        return "servicios/rayosx";
    }
    @RequestMapping("/examenMedico")
    public String examenMed2(){
        return "servicios/examen";
    }
    @RequestMapping("/rayosx/agendar")
    public String agendarMed(){
        return "agendar";
    }
    @RequestMapping("/examenMedico/agendar")
    public String agendarMed2(){
        return "agendar";
    }
}
