package com.example.proyectot3.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.proyectot3.model.entidad.Doctores;

public interface IDoctoresDAO  extends CrudRepository<Doctores,Long>{
    
    public List<Doctores> findAllByOrderByNombreAsc();
}
