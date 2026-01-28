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
    // Constructor
    public SCliente(ICliente iCliente)
    {
        this.iCliente = iCliente;
    }

    // Guardar
    public MCliente guardar(MCliente mCliente) throws Exception{
        try{
            return this.iCliente.save(mCliente);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    // Consulta general
    public List<MCliente> consultaGeneral() throws Exception{
        try{
            return this.iCliente.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    // Consulta individual identificacion
    public MCliente consultaIndividualId(Integer ideCliente) throws Exception{
        try{
            Optional<MCliente> clienteEncontrado=this.iCliente.findById(ideCliente);
            if (clienteEncontrado.isPresent())
                return clienteEncontrado.get();
            else
                throw new Exception("Cliente no encontrado");
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    // Consulta individual nombre
    public List<MCliente> consultaIndividualNombre(String nomCliente) throws Exception{
        try{
            return this.iCliente.findByNomcliente(nomCliente);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    // Modificar
    public MCliente modificar(MCliente mCliente, Integer ideCliente) throws Exception
    {
        try
        {
            Optional<MCliente> clienteEcontrado = this.iCliente.findById(ideCliente);
            if (clienteEcontrado.isPresent())
            {
                MCliente nuevoregistro = clienteEcontrado.get();
                nuevoregistro.setIdeCliente(mCliente.getIdeCliente());
                nuevoregistro.setNomcliente(mCliente.getNomcliente());
                nuevoregistro.setDircliente(mCliente.getDircliente());
                nuevoregistro.setTelcliente(mCliente.getTelcliente());
                nuevoregistro.setActivo(mCliente.getActivo());
                return this.iCliente.save(nuevoregistro);
            }
            else
            {
                throw new Exception("No se puede modificar el registro por que le cliente no esta registrado.");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }
    // Eliminar
    public Boolean eliminar(Integer ideCliente) throws Exception
    {
        try
        {
            Optional<MCliente> clienteEncontrado = this.iCliente.findById(ideCliente);
            if (clienteEncontrado.isPresent())
            {
                this.iCliente.deleteById(ideCliente);
                return true;            }
            else
            {
                throw new Exception("No se puede eliminar cliente, por que el cliente no existe");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }
    // Anular

    public MCliente anular(MCliente mCliente, Integer ideCliente) throws Exception
    {
        try
        {
            Optional<MCliente> clienteEncontrado = this.iCliente.findById(ideCliente);
            if (clienteEncontrado.isPresent())
            {
                MCliente nuevoRegistro = clienteEncontrado.get();
                if (mCliente.getActivo().equals("True"))
                {
                    nuevoRegistro.setActivo("True");
                }
                else
                {
                    nuevoRegistro.setActivo("False");
                }
                return  this.iCliente.save(nuevoRegistro);
            }
            else
            {
                throw new Exception("No se puede anular, Cliente no registrado");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }
}
