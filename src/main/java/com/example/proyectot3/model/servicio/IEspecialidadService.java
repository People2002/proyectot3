package com.example.proyectot3.model.servicio;

import java.util.List;

import com.example.proyectot3.model.entidad.Especialidad;

public interface IEspecialidadService {
    public void guardarEspecialidad(Especialidad especialidad);
    public List<Especialidad> cargarEspecialidades();
    public Especialidad buscarEspecialidad(Long id);
    public void eliminarEspecialidad(Long id);
}
