package com.Cesde.Concesionario.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class MCliente {
    @Id
    @Column(name="idecliente",nullable = false)
    private Integer ideCliente;
    @Column(length = 100,nullable = false)
    private String nomcliente;
    @Column(length = 50,nullable = false)
    private String dircliente;
    @Column(length = 10,nullable = false)
    private String telcliente;
    @Column(length = 5,nullable = false)
    private String activo;

    // Constructores
    public MCliente(Integer ideCliente, String nomcliente, String dircliente, String telcliente, String activo) {
        this.ideCliente = ideCliente;
        this.nomcliente = nomcliente;
        this.dircliente = dircliente;
        this.telcliente = telcliente;
        this.activo = activo;
    }

    public MCliente() {
    }
    // Metodos Get y Set (Encapsulamiento)
    public Integer getIdeCliente() {
        return ideCliente;
    }
    public void setIdeCliente(Integer ideCliente) {
        this.ideCliente = ideCliente;
    }

    public String getNomcliente() {
        return nomcliente;
    }
    public void setNomcliente(String nomcliente) {
        this.nomcliente = nomcliente;
    }

    public String getDircliente() {
        return dircliente;
    }
    public void setDircliente(String dircliente) {
        this.dircliente = dircliente;
    }

    public String getTelcliente() {
        return telcliente;
    }
    public void setTelcliente(String telcliente) {
        this.telcliente = telcliente;
    }

    public String getActivo() {
        return activo;
    }
    public void setActivo(String activo) {
        this.activo = activo;
    }
}
