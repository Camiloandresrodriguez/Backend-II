package org.example;

public abstract class Persona
{
    private String identificacion;
    private String nombre;
    private String telefono;

    public String getIdentificacion()
    {
        return identificacion;
    }

    public void setIdentificacion(String identificacion)
    {
        this.identificacion = identificacion;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }

    abstract public void contratar();
    abstract public void profesion();
}
