package com.Cesde.Concesionario.Repositorio;

import com.Cesde.Concesionario.Modelo.MVehiculoFactura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IVehiculoFactura extends JpaRepository<MVehiculoFactura,Integer> {
}
