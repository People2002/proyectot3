package com.example.proyectot3.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.proyectot3.model.entidad.Servicios;
import com.example.proyectot3.model.servicio.ICategoriaServService;
import com.example.proyectot3.model.servicio.IServiciosService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/servicios")
public class PanelServiciosController {
    
    @Autowired
    private IServiciosService serviciosService;

    @Autowired
    private ICategoriaServService categoriaServService;

    @RequestMapping("/")
    public String inicio(Model model){
        Servicios servicios  = new Servicios();
        model.addAttribute("servicios", servicios);
        model.addAttribute("listaCategoriasServ", categoriaServService.cargarCategoriaServ());
        model.addAttribute("listaServicios", serviciosService.cargarServicios());

        return "panelServicios/inicio";
    }

    @RequestMapping(value= "/form", method=RequestMethod.POST)
    public String guardar(Servicios servicios, Model model, RedirectAttributes flash) {
        String rpta = serviciosService.guardarServicios(servicios);
        flash.addFlashAttribute("mensaje",rpta);
        return "redirect:/servicios/";
    }

    @RequestMapping("/eliminar/{id}")
    public String Eliminiar(@PathVariable(value = "id")Long id, Model model, RedirectAttributes flash){
        String rpta= serviciosService.eliminarServicios(id);
        flash.addFlashAttribute("mensaje", rpta);
        return "redirect:/servicios/";
    }
    
}
