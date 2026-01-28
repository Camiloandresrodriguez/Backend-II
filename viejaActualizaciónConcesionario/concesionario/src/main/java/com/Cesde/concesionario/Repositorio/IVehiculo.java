package com.Cesde.Concesionario.Repositorio;

import com.Cesde.Concesionario.Modelo.MVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IVehiculo extends JpaRepository<MVehiculo, String>
{
    List<MVehiculo> findByMarca(String marca);
}
