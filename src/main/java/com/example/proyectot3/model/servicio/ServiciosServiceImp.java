package com.example.proyectot3.model.servicio;

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


    
    
}
