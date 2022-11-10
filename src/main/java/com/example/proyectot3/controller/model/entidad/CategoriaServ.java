package com.example.proyectot3.controller.model.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoria_servicio")
public class CategoriaServ implements Serializable{
    //categoriaServ_id,categoriaServ_nombre,categoriaServ_costo
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_serv_id")
    private Long id;

    @Column(name = "cat_serv_nombre")
    private String nombre;

    @Column(name = "cat_serv_costo")
    private Float costo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }
}
