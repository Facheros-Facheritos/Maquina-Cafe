
package CapaNegocio;

public class Azucar extends Ingredientes
{
    private String presentacion;   //cubos, cristales o polvo
    private String tipo;   //mascabado, morena o blanca
    
    public String getPresentacion()
    {
        return this.presentacion;
    }
    public void setPresentacion(String presentacion)
    {
        this.presentacion = presentacion;
    }
    
    public String getTipo()
    {
        return this.tipo;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    public String NutrirSistemaNervioso()
    {
        return "El método Nutrir al Sistema Nervioso recién será implementado";
    }
    public String AportarEnergia()
    {
        return "El método Aportar Enrgia recién será implementado";
    }
    public String ConciliarSueño()
    {
        return "El método Conciliar Sueño recién será implementado";
    }
}
