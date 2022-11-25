package com.example.proyectot3.model.servicio;

import java.util.List;

import com.example.proyectot3.model.entidad.Doctores;

public interface IDoctoresService {
    
    public String guardarDoctores(Doctores doctores);
    public List<Doctores> cargarDoctores();
    public String eliminarDoctor(Long id);
}
