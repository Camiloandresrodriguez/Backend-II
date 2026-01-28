package com.Cesde.Concesionario.Modelo;

import jakarta.persistence.*;
@Entity
@Table(name = "vehiculofactura")
public class MVehiculoFactura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer consecutivovf;
    @Column(nullable = false)
    private Integer codfactura;
    @Column(length = 7,nullable = false)
    private String placa;
    @Column(nullable = false)
    private Integer valventa;

    // Constructores
    public MVehiculoFactura(Integer consecutivovf, Integer codfactura, String placa, Integer valventa) {
        this.consecutivovf = consecutivovf;
        this.codfactura = codfactura;
        this.placa = placa;
        this.valventa = valventa;
    }
    public MVehiculoFactura() {
    }

    // Encapsular con Get y Set
    public Integer getConsecutivovf() {
        return consecutivovf;
    }
    public void setConsecutivovf(Integer consecutivovf) {
        this.consecutivovf = consecutivovf;
    }

    public Integer getCodfactura() {
        return codfactura;
    }
    public void setCodfactura(Integer codfactura) {
        this.codfactura = codfactura;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getValventa() {
        return valventa;
    }
    public void setValventa(Integer valventa) {
        this.valventa = valventa;
    }
}
