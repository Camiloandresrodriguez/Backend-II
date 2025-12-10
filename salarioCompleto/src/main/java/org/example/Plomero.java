package org.example;

public class Plomero extends Persona implements IEmpleado, IExtras
{
    @Override
    public float salario(short numeroDeHoras)
    {
        /*
        float salario;
        if (numeroDeHoras >= 168)
            salario = numeroDeHoras * 30000;
        else
            salario = numeroDeHoras * 30000 + (numeroDeHoras - 168) * 5000;
        return 0
        */
        return numeroDeHoras <= 168 ? numeroDeHoras * 30000 : numeroDeHoras * 30000 + (numeroDeHoras - 168) * 5000;
    }

    @Override
    public float liquidacion(float salarioBasico)
    {
        return salarioBasico * 2.8f;
    }

    @Override
    public float comision(short numeroDeHoras)
    {
        return numeroDeHoras >= 100 ? 200000f : 0F ;
    }

    @Override
    public void contratar()
    {
        if (this.getIdentificacion().equals("10101010"))
            System.out.println("El plomero " + this.getNombre() + "No se puede contratar");
        else
            System.out.println("El plomero con identificación " + this.getIdentificacion() + " esta contratado ");
    }

    @Override
    public void profesion()
    {
        System.out.println(this.getNombre() + " es un plomero ");
    }
}
