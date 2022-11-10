package com.example.proyectot3.controller.model.servicio;

import java.util.List;

import com.example.proyectot3.controller.model.entidad.CategoriaServ;

public interface ICategoriaServService {
    public void guardarCategoriaServ(CategoriaServ categoriaServ);
    public List<CategoriaServ> cargarCategoriaServ();
    public CategoriaServ busCategoriaServ(Long id);
    public void eliminarCategoriaServ(Long id);
}
