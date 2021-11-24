package CapaNegocio;

public class Producto extends MaquinaCafe
{
    private String nombre;
    private String costo;
    
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getCosto()
    {
        return this.costo;
    }
    public void setCosto(String costo)
    {
        this.costo = costo;
    }
}
