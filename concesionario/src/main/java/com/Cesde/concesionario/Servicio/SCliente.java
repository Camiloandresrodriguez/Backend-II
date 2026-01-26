package com.Cesde.Concesionario.Servicio;

import com.Cesde.Concesionario.Modelo.MCliente;
import com.Cesde.Concesionario.Repositorio.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SCliente
{
    @Autowired
    ICliente iCliente;

    public SCliente(ICliente iCliente)
    {
        this.iCliente = iCliente;
    }

    //Guardar
    public MCliente guardar(MCliente mCliente) throws Exception
    {
        try
        {
            return this.iCliente.save(mCliente);
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    //Consulta General
    public List<MCliente> consultaGeneral() throws Exception
    {
        try
        {
            return this.iCliente.findAll();
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    //Consulta individual identificacion
    public MCliente consultaIndividualIde(Integer ideCliente) throws Exception
    {
        try
        {
            Optional<MCliente>clienteEncontrado = this.iCliente.findById(ideCliente);
            if (clienteEncontrado.isPresent())
            {
                return clienteEncontrado.get();
            }
            else
            {
                throw new Exception("Cliente no encontrado");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }
}
