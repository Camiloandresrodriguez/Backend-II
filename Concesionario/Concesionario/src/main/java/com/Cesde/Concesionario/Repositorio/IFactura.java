package com.Cesde.Concesionario.Repositorio;

import com.Cesde.Concesionario.Modelo.MFactura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFactura extends JpaRepository<MFactura,Integer> {
}
