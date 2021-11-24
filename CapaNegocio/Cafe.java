package CapaNegocio;

public class Cafe extends Ingredientes
{
    private String tipo;   //grano o soluble
    private String lugarOrigen;   //Colombia,Perú, Mexico
    private String amargor;
    
    public String getTipo()
    {
        return this.tipo;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public String getLugarOrigen()
    {
        return this.lugarOrigen;
    }
    public void setLugarOrigen(String lugarOrigen)
    {
        this.lugarOrigen = lugarOrigen;
    }
    
    public String getAmargor()
    {
        return this.amargor;
    }
    public void setAmargor(String amargor)
    {
        this.amargor = amargor;
    }
    
    public String QuemarGrasa()
    {
        return "El método Quemar Grasa recién será implementado";
    }
    public String AportarNutrientes()
    {
        return "El método Aportar Nutrientes recién será implementado";
    }
    public String ProtegerCorazonHigado()
    {
        return "El método Proteger Corazon e Higado recién será implementado";
    }
}
