package com.example.proyectot3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.proyectot3.model.entidad.CategoriaServ;
import com.example.proyectot3.model.servicio.ICategoriaServService;

@Controller
@RequestMapping("/categoriaServicio")
public class CategoriaServController {
    
    @Autowired
    private ICategoriaServService categoriaServService;

    @RequestMapping("/")
    public String inicio(Model model){
        CategoriaServ categoriaServ = new CategoriaServ();
        model.addAttribute("categoriaServ", categoriaServ);
        model.addAttribute("listaCategoriasServ", categoriaServService.cargarCategoriaServ());
        return "panelcategoriaServicio/index";
    }

    @RequestMapping(value = "/registro",method = RequestMethod.POST)
    public String guardar(CategoriaServ categoriaServ,Model model,RedirectAttributes flash){
        String rpta = categoriaServService.guardarCategoriaServ(categoriaServ);
        flash.addFlashAttribute("mensaje",rpta);
        return "redirect:/categoriaServicio/";
    }

    @RequestMapping("/editar/{id}")
    public String editar(@PathVariable(value = "id") Long id, Model model){
        CategoriaServ categoriaServ = categoriaServService.busCategoriaServ(id);
        model.addAttribute("categoriaServ", categoriaServ);
        model.addAttribute("listaCategoriasServ", categoriaServService.cargarCategoriaServ());
        return "panelcategoriaServicio/index";
    }

    @RequestMapping("eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id,Model model,RedirectAttributes flash){
        String rpta = categoriaServService.eliminarCategoriaServ(id);
        flash.addFlashAttribute("mensaje",rpta);
        return "redirect:/categoriaServicio/";
    }
}
