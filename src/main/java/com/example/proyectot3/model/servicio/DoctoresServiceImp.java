package com.example.proyectot3.model.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectot3.model.dao.IDoctoresDAO;
import com.example.proyectot3.model.entidad.Doctores;

@Service
public class DoctoresServiceImp implements IDoctoresService{

    @Autowired
    private IDoctoresDAO doctoresDAO;

    @Override
    public String guardarDoctores(Doctores doctores) {
        String rpta = "";

        try{
            doctoresDAO.save(doctores);
            rpta="Se guardo los datos del doctor correctamente";

        }catch(Exception e){
            rpta=e.getMessage();
        }
        return rpta;
    }

    @Override
    public List<Doctores> cargarDoctores() {
        return doctoresDAO.findAllByOrderByNombreAsc();
    }

    @Override
    public String eliminarDoctor(Long id) {
        String rpta="";
        try{
            doctoresDAO.deleteById(id);
            rpta = "Se elimino el producto correctamente";
        }catch(Exception e){
            rpta = e.getMessage();
        }
        return rpta;
    }

    
}
