package com.example.proyectot3.model.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "servicios")
public class Servicios implements Serializable{
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "servicios_id")
    private Long id;

    @Column(name = "servicios_nombre")
    private String nombre;

    @Column(name = "servicios_costo")
    private String costo;

    @ManyToOne
    @JoinColumn(name = "categoriaserv_cat_serv_id")
    CategoriaServ categoriaServ;

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

    public CategoriaServ getCategoriaServ() {
        return categoriaServ;
    }

    public void setCategoriaServ(CategoriaServ categoriaServ) {
        this.categoriaServ = categoriaServ;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    
}
