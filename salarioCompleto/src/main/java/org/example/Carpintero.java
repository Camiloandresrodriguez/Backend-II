package org.example;

public class Carpintero extends Persona implements IEmpleado
{
    @Override
    public float salario(short numeroDeHoras)
    {
        /* float salario;
        if (numeroDeHoras < 168)
        {
            salario = numeroDeHoras * 20000;
        }
        else
        {
            salario = numeroDeHoras * 25000;
        }
        return salario;
        */
        return numeroDeHoras < 168 ? numeroDeHoras * 20000: numeroDeHoras * 25000;
    }

    @Override
    public float liquidacion(float salarioBasico)
    {
        /* float valorLiquidacion;
        if (salarioBasico <= 4 * 1423500)
        {
            valorLiquidacion = salarioBasico * 2.8f;
        }
        else
        {
            valorLiquidacion = salarioBasico * 3.2f;
        }
        return valorLiquidacion;
        */
        return salarioBasico <= 4 * 1423500 ? salarioBasico * 2.8f : salarioBasico * 3.2f;
    }

    @Override
    public void contratar()
    {
        System.out.println("El carpintero " + this.getNombre()+ "esta contratado, llamar al telefono "+ this.getTelefono());
    }

    @Override
    public void profesion()
    {
        System.out.println("la persona con identificación " + this.getIdentificacion()+ "es un carpintero ");
    }
}
