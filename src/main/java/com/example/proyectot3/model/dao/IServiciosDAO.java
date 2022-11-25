package com.example.proyectot3.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.proyectot3.model.entidad.Servicios;

public interface IServiciosDAO extends CrudRepository<Servicios,Long>{
    
    public List<Servicios> findAllByOrderByNombreAsc();
}
