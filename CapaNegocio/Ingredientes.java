package CapaNegocio;

public class Ingredientes extends MaquinaCafe
{
    private String nombre;
    private String calidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }
    
    public String ElegirIngrediente()
    {
        return "El método ElegirIngrediente recién será implementado";
    }
}
