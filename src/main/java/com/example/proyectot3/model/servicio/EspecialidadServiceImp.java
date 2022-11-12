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
    public String guardarEspecialidad(Especialidad especialidad) {
        String rpta = "";

        try{
            if(especialidad.getId() == null){                
                rpta="Se guardo los datos de la especialidad correctamente";
            }else{
                rpta="Se edito los datos de la especialidad correctamente";
            }
            especialidadDAO.save(especialidad);
            

        }catch(Exception e){
            rpta=e.getMessage();
        }
        return rpta; 
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
    public String eliminarEspecialidad(Long id) {     
        String rpta = "";

        try{
            especialidadDAO.deleteById(id);   
            rpta="Se elimino los datos de la especialidad correctamente";

        }catch(Exception e){
            rpta=e.getMessage();
        }
        return rpta;    
    }
    
}
