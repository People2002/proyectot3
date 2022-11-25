package com.example.proyectot3.model.servicio;

import java.util.List;

import com.example.proyectot3.model.entidad.Servicios;

public interface IServiciosService {
    
    public String guardarServicios(Servicios servicios);
    public List<Servicios> cargarServicios();
    public String eliminarServicios(Long id);
}
