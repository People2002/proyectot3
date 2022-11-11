package com.example.proyectot3.model.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectot3.model.dao.IEspecialidadDAO;
import com.example.proyectot3.model.entidad.Especialidad;

@Service
public class EspecialidadServiceImp implements IEspecialidadService{

    @Autowired
    private IEspecialidadDAO especialidadDAO;

    @Override
    public void guardarEspecialidad(Especialidad especialidad) {
        especialidadDAO.save(especialidad); 
    }

    @Override
    public List<Especialidad> cargarEspecialidades() {
        // return (List<Especialidad>)especialidadDAO.findAll();
        return especialidadDAO.findAllByOrderByNombre();
    }

    @Override
    public Especialidad buscarEspecialidad(Long id) {
        return especialidadDAO.findById(id).orElse(null);
    }

    @Override
    public void eliminarEspecialidad(Long id) {
        especialidadDAO.deleteById(id);        
    }
    
}
