package com.example.proyectot3.model.servicio;

import java.util.List;

import com.example.proyectot3.model.entidad.CategoriaServ;

public interface ICategoriaServService {
    public String guardarCategoriaServ(CategoriaServ categoriaServ);
    public List<CategoriaServ> cargarCategoriaServ();
    public CategoriaServ busCategoriaServ(Long id);
    public String eliminarCategoriaServ(Long id);
}
