package com.example.proyectot3.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.proyectot3.model.entidad.CategoriaServ;

public interface ICategoriaServDAO extends CrudRepository<CategoriaServ,Long>{
    public List<CategoriaServ> findAllByOrderByNombre();
}
