package com.example.proyectot3.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.proyectot3.model.entidad.Especialidad;

public interface IEspecialidadDAO extends CrudRepository<Especialidad, Long>{
    public List<Especialidad> findAllByOrderByNombre();
    
}
