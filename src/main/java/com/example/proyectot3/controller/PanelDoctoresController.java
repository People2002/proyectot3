package com.example.proyectot3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.proyectot3.model.entidad.Doctores;
import com.example.proyectot3.model.servicio.IDoctoresService;
import com.example.proyectot3.model.servicio.IEspecialidadService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/doctores")
public class PanelDoctoresController {

    @Autowired
    private IEspecialidadService especialidadService;
    
    @Autowired
    private IDoctoresService doctoresService;

    @RequestMapping("/")
    public String inicio(Model model){
        Doctores doctores = new Doctores();
        model.addAttribute("doctores", doctores);
        model.addAttribute("listaEspecilidades", especialidadService.cargarEspecialidades());
        model.addAttribute("listaDoctores", doctoresService.cargarDoctores());
        return "paneldoctores/inicio";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String guardar(Doctores doctores, Model model, RedirectAttributes flash) {
        String rpta = doctoresService.guardarDoctores(doctores);
        flash.addFlashAttribute("mensaje", rpta);
        return "redirect:/doctores/";
    }

    @RequestMapping("/eliminar/{id}")
    public String Eliminiar(@PathVariable(value = "id")Long id, Model model, RedirectAttributes flash){
        String rpta= doctoresService.eliminarDoctor(id);
        flash.addFlashAttribute("mensaje", rpta);
        return "redirect:/doctores/";
    }
    
}
