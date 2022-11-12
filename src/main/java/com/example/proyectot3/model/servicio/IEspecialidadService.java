package com.example.proyectot3.model.servicio;

import java.util.List;

import com.example.proyectot3.model.entidad.Especialidad;

public interface IEspecialidadService {
    public String guardarEspecialidad(Especialidad especialidad);

    public List<Especialidad> cargarEspecialidades();

    public Especialidad buscarEspecialidad(Long id);
    
    public String eliminarEspecialidad(Long id);
}
