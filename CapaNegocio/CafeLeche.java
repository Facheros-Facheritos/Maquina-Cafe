package CapaNegocio;

public class CafeLeche extends Producto
{
    private String presentacion;   //frío o caliente
    private String cantidadLeche;   //mucha o poca leche
    
    public String getPresentacion()
    {
        return this.presentacion;
    }
    public void setPresentacion(String presentacion)
    {
        this.presentacion = presentacion;
    }
    public String getCantidadLeche()
    {
        return this.cantidadLeche;
    }
    public void setCantidadLeche(String cantidadLeche)
    {
        this.cantidadLeche = cantidadLeche;
    }
    
    public String ActivarMente()
    {
        return "El método Activar Mente recién será implementado";
    }
    public String AumentarRendimientoFisico()
    {
        return "El método Aumentar Rendimiento Fisico recién será implementado";
    }
    public String CombatirAlzheimer()
    {
        return "El método COMBATIR ALZHEIMER recién será implementado";
    }
}
