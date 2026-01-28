package com.Cesde.Concesionario.Repositorio;

import com.Cesde.Concesionario.Modelo.MCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ICliente extends JpaRepository<MCliente, Integer>
{
    List<MCliente> findByNombrecliente(String Nombrecliente);
}
