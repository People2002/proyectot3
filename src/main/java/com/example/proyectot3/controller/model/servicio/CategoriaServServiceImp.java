package com.example.proyectot3.controller.model.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectot3.controller.model.dao.ICategoriaServDAO;
import com.example.proyectot3.controller.model.entidad.CategoriaServ;

@Service
public class CategoriaServServiceImp implements ICategoriaServService{

    @Autowired
    private ICategoriaServDAO categoriaServDAO;

    @Override
    public void guardarCategoriaServ(CategoriaServ categoriaServ) {
        categoriaServDAO.save(categoriaServ);
    }

    @Override
    public List<CategoriaServ> cargarCategoriaServ() {
        return (List<CategoriaServ>)categoriaServDAO.findAll();
    }

    @Override
    public CategoriaServ busCategoriaServ(Long id) {
        return categoriaServDAO.findById(id).orElse(null);
    }

    @Override
    public void eliminarCategoriaServ(Long id) {
        categoriaServDAO.deleteById(id);  
    }

}
