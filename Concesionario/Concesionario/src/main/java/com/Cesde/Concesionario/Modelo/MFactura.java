package com.Cesde.Concesionario.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
@Entity
@Table(name = "factura")
public class MFactura {
    @Id
    @Column(nullable = false)
    private Integer codfactura;
    @Column(nullable = false)
    private LocalDate fecha;
    @Column(nullable = false)
    private Integer idecliente;
    @Column(length = 5,nullable = false)
    private String activo;
    // Constructores
    public MFactura(Integer codfactura, LocalDate fecha, Integer idecliente, String activo) {
        this.codfactura = codfactura;
        this.fecha = fecha;
        this.idecliente = idecliente;
        this.activo = activo;
    }
    public MFactura() {
    }

    // Encapsulamiento con Get y Set
    public Integer getCodfactura() {
        return codfactura;
    }
    public void setCodfactura(Integer codfactura) {
        this.codfactura = codfactura;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getIdecliente() {
        return idecliente;
    }
    public void setIdecliente(Integer idecliente) {
        this.idecliente = idecliente;
    }

    public String getActivo() {
        return activo;
    }
    public void setActivo(String activo) {
        this.activo = activo;
    }
}
