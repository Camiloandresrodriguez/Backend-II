package com.Cesde.Concesionario.Modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "facturavehiculo")
public class MVehiculoFactura
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer consecutivofacturavehiculo;

    @Column(nullable = false)
    private Integer codigofactura;

    @Column(length = 7, nullable = false)
    private String placa;

    @Column(nullable = false)
    private Integer valorventa;

    public MVehiculoFactura(Integer consecutivofacturavehiculo, Integer codigofactura, String placa, Integer valorventa)
    {
        this.consecutivofacturavehiculo = consecutivofacturavehiculo;
        this.codigofactura = codigofactura;
        this.placa = placa;
        this.valorventa = valorventa;
    }

    public MVehiculoFactura()
    {

    }

    public Integer getConsecutivofacturavehiculo()
    {
        return consecutivofacturavehiculo;
    }

    public void setConsecutivofacturavehiculo(Integer consecutivofacturavehiculo)
    {
        this.consecutivofacturavehiculo = consecutivofacturavehiculo;
    }

    public Integer getCodigofactura()
    {
        return codigofactura;
    }

    public void setCodigofactura(Integer codigofactura)
    {
        this.codigofactura = codigofactura;
    }

    public String getPlaca()
    {
        return placa;
    }

    public void setPlaca(String placa)
    {
        this.placa = placa;
    }

    public Integer getValorventa()
    {
        return valorventa;
    }

    public void setValorventa(Integer valorventa)
    {
        this.valorventa = valorventa;
    }
}
