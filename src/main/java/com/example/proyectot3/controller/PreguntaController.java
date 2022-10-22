package com.example.proyectot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PreguntaController {
    @RequestMapping("/preguntas")
    public String pregunta(){
        return "preguntas";
    }
}
