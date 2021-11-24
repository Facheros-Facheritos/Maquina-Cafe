package CapaNegocio;

public class Cacao extends Ingredientes
{
    private String marca;   //3ositos, winter, donofrio, etc
    private String lugarOrigen;   //Colombia,Perú y Mexico
    private String presentacion;   //soluble, azucarado o polvo
    
    public String getMarca()
    {
        return this.marca;
    }
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    public String getLugarOrigen()
    {
        return this.lugarOrigen;
    }
    public void setLugarOrigen(String lugarOrigen)
    {
        this.lugarOrigen = lugarOrigen;
    }
    public String getPresentacion()
    {
        return this.presentacion;
    }
    public void setPresentacion(String presentacion)
    {
        this.presentacion = presentacion;
    }
    public String ReducirInflamacion()
    {
        return "El método ReducirInflamacion recién será implementado";
    }
    public String AyudarMemoria()
    {
        return "El método Ayudar Memoria recién será implementado";
    }
    public String MejorarAnimo()
    {
        return "El método Mejorar Animo recién será implementado";
    }
    public String PrevenirCancer()
    {
        return "El método Prevenir Cancer e Higado recién será implementado";
    }
}   
