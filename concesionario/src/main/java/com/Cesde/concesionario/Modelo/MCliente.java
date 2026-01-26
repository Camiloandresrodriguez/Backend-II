package com.Cesde.Concesionario.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "cliente")

public class MCliente
{
    @Id
    @Column(name = "idecliente", nullable = false) //se usa para modificar un atributo.
    private Integer idecliente;

    @Column(length = 100, nullable = false)
    private String nombrecliente;

    @Column (length = 50, nullable = false)
    private String direccioncliente;

    @Column(length = 10, nullable = false)
    private String telefonocliente;

    @Column(length = 5, nullable = false)
    private String activo;

    //Constructores

    public MCliente(Integer idecliente, String nombrecliente, String direccioncliente, String telefonocliente, String activo)
    {
        this.idecliente = idecliente;
        this.nombrecliente = nombrecliente;
        this.direccioncliente = direccioncliente;
        this.telefonocliente = telefonocliente;
        this.activo = activo;
    }

    public MCliente()
    {

    }

    //Metodos set y get

    public Integer getIdecliente()
    {
        return idecliente;
    }

    public void setIdecliente(Integer idecliente)
    {
        this.idecliente = idecliente;
    }

    public String getNombrecliente()
    {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente)
    {
        this.nombrecliente = nombrecliente;
    }

    public String getDireccioncliente()
    {
        return direccioncliente;
    }

    public void setDireccioncliente(String direccioncliente)
    {
        this.direccioncliente = direccioncliente;
    }

    public String getTelefonocliente()
    {
        return telefonocliente;
    }

    public void setTelefonocliente(String telefonocliente)
    {
        this.telefonocliente = telefonocliente;
    }

    public String getActivo()
    {
        return activo;
    }

    public void setActivo(String activo)
    {
        this.activo = activo;
    }
}
