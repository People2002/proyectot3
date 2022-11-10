package com.example.proyectot3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.proyectot3.model.entidad.Especialidad;
import com.example.proyectot3.model.servicio.IEspecialidadService;

@Controller
@RequestMapping("/panel/especialidad")
public class PanelEspecialidadController {
    
    @Autowired
    private IEspecialidadService especialidadService;

    @RequestMapping("/")
    public String inicio(Model model){
        Especialidad especialidad = new Especialidad();
        model.addAttribute("especialidad", especialidad);
        model.addAttribute("listaEspecialidades", especialidadService.cargarEspecialidades());
        return "panelEspecialidad/index";
    }

    @RequestMapping(value="/formulario", method = RequestMethod.POST)
    public String guardar(Especialidad especialidad){
        especialidadService.guardarEspecialidad(especialidad);
        return "redirect:/panel/especialidad/";
    }

    @RequestMapping("/editar/{id}")
    public String editar(@PathVariable(value = "id") Long id, Model model){
        Especialidad especialidad = especialidadService.buscarEspecialidad(id);
        model.addAttribute("especialidad", especialidad);
        model.addAttribute("listaEspecialidades", especialidadService.cargarEspecialidades());
        return "panelEspecialidad/index";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value="id") Long id){
        especialidadService.eliminarEspecialidad(id);
        return "redirect:/panel/especialidad/";
    }
}
