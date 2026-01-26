package com.Cesde.Concesionario.Repositorio;

import com.Cesde.Concesionario.Modelo.MCliente;
import com.Cesde.Concesionario.Modelo.MFactura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFactura extends JpaRepository<MFactura, Integer>
{
    List<MFactura> findBy();
}
