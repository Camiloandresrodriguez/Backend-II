package com.Cesde.Concesionario.Servicio;

import com.Cesde.Concesionario.Modelo.MVehiculo;
import com.Cesde.Concesionario.Repositorio.IVehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SVehiculo
{
    @Autowired
    IVehiculo iVehiculo;

    public SVehiculo(IVehiculo iVehiculo)
    {
        this.iVehiculo = iVehiculo;
    }

    //GUARDAR
    public MVehiculo guardar(MVehiculo mVehiculo) throws Exception
    {
        try
        {
            return this.iVehiculo.save(mVehiculo);
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    //CONSULTA GENRAL

    public List<MVehiculo> consultaGeneral() throws Exception
    {
        try
        {
            return this.iVehiculo.findAll();
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    //CONSULTA INDIVIDUAL POR MATRICULA

    public MVehiculo consultaIndividual(String placa) throws Exception
    {
        try
        {
            Optional<MVehiculo>vehiculoEncontrado=this.iVehiculo.findById(placa);
            if (vehiculoEncontrado.isPresent())
            {
                return vehiculoEncontrado.get();
            }
            else
            {
                throw new Exception("Vehiculo no encontrado.");
            }
        }
        catch (Exception eror)
        {
            throw new Exception(eror.getMessage());
        }
    }

    //CONSULTA INDIVIDUAL POR MARCA

    public List<MVehiculo>consultaindividualMarca(String marca) throws Exception
    {
        try
        {
            return this.iVehiculo.findByMarca(marca);
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    //MODIFICAR

    public MVehiculo modifiar(MVehiculo mVehiculo, String placa) throws Exception
    {
        try
        {
            Optional<MVehiculo> vehiculoEncontrado = this.iVehiculo.findById(placa);
            if (vehiculoEncontrado.isPresent())
            {
                MVehiculo nuevoRegistro = vehiculoEncontrado.get();
                nuevoRegistro.setPlaca(mVehiculo.getPlaca());
                nuevoRegistro.setMarca(mVehiculo.getMarca());
                nuevoRegistro.setModelo(mVehiculo.getModelo());
                nuevoRegistro.setValor(mVehiculo.getValor());
                nuevoRegistro.setActivo(mVehiculo.getActivo());
                return this.iVehiculo.save(nuevoRegistro);
            }
            else
            {
                throw new Exception("No se puede modificar, por qu el vehiculo no esta registrado");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    //ELIMINAR

    public Boolean eliminar(String placa) throws Exception
    {
        try
        {
            Optional<MVehiculo> vehiculoEncontrado = this.iVehiculo.findById(placa);
            if (vehiculoEncontrado.isPresent())
            {
                this.iVehiculo.deleteById(placa);
                return true;
            }
            else
            {
                throw new Exception("No se puede eliminar elvehiculo, por que no se encuentra registrado");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    //ANULAR

    public MVehiculo anular(MVehiculo mVehiculo, String placa) throws Exception
    {
        try
        {
                Optional<MVehiculo> vehiculoEcontrado = this.iVehiculo.findById(placa);
                if (vehiculoEcontrado.isPresent())
                {
                    MVehiculo nuevoRegistro = vehiculoEcontrado.get();
                    if (mVehiculo.getActivo().equals("True"))
                    {
                        nuevoRegistro.setActivo("True");
                    }
                    else
                    {
                        nuevoRegistro.setActivo("False");
                    }
                    return this.iVehiculo.save(nuevoRegistro);
                }
                else
                {
                    throw new Exception("No se puede anular, porque el vehiculo no se encuentra registrado");
                }
        }
        catch (Exception erro)
        {
            throw new Exception(erro.getMessage());
        }
    }
}
