package com.Cesde.Concesionario.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class MVehiculo
{
    @Id
    @Column(length = 7, nullable = false)
    private String placa;

    @Column(length = 20, nullable = false)
    private String marca;

    @Column(length = 4, nullable = false)
    private String modelo;

    @Column(nullable = false)
    private Integer valor;

    @Column(length = 5, nullable = false)
    private String activo;

    public MVehiculo(String placa, String marca, String modelo, Integer valor, String activo)
    {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
        this.activo = activo;
    }

    public MVehiculo()
    {

    }

    public String getPlaca()
    {
        return placa;
    }

    public void setPlaca(String placa)
    {
        this.placa = placa;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public Integer getValor()
    {
        return valor;
    }

    public void setValor(Integer valor)
    {
        this.valor = valor;
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

