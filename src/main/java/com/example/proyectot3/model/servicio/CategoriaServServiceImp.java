package com.example.proyectot3.model.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectot3.model.dao.ICategoriaServDAO;
import com.example.proyectot3.model.entidad.CategoriaServ;

@Service
public class CategoriaServServiceImp implements ICategoriaServService{

    @Autowired
    private ICategoriaServDAO categoriaServDAO;

    @Override
    public String guardarCategoriaServ(CategoriaServ categoriaServ) {
        String rpta = "";
        try{
            if(categoriaServ.getId() == null){                
                rpta="Se guardaron los datos correctamente";
            }else{
                rpta="Se editaron los datos correctamente";
            }
            categoriaServDAO.save(categoriaServ);
            

        }catch(Exception e){
            rpta=e.getMessage();
        }
        return rpta; 
    }

    @Override
    public List<CategoriaServ> cargarCategoriaServ() {
        return (List<CategoriaServ>)categoriaServDAO.findAll();
    }

    @Override
    public CategoriaServ busCategoriaServ(Long id) {
        return categoriaServDAO.findById(id).orElse(null);
    }

    @Override
    public String eliminarCategoriaServ(Long id) {
        String rpta = "";
        try{
            categoriaServDAO.deleteById(id);  
            rpta="Se eliminaron los datos correctamente";
        }catch(Exception e){
            rpta = e.getMessage();
        }
        return rpta;
    }

}
