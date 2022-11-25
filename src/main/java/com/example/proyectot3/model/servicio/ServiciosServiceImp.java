package com.example.proyectot3.model.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectot3.model.dao.IServiciosDAO;
import com.example.proyectot3.model.entidad.Servicios;

@Service
public class ServiciosServiceImp implements IServiciosService{

    @Autowired
    private IServiciosDAO serviciosDAO;

    @Override
    public String guardarServicios(Servicios servicios) {
       String rpta = "";

        try{
            serviciosDAO.save(servicios);
           rpta="Se guardo el servicio correctamente";

        }catch(Exception e){
            rpta=e.getMessage();
        }
        return rpta;
    }

    @Override
    public List<Servicios> cargarServicios() {
        return serviciosDAO.findAllByOrderByNombreAsc();
    }

    @Override
    public String eliminarServicios(Long id) {
        String rpta="";
        try{
            serviciosDAO.deleteById(id);
            rpta = "Se elimino el servicio correctamente";
        }catch(Exception e){
            rpta = e.getMessage();
        }
        return rpta;
    }


    
    
}
