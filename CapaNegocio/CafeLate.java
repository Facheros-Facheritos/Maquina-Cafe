package CapaNegocio;

public class CafeLate extends Producto
{
    private String presentacion;   //frío o caliente
    private String cantidadLate;   //mucho o poco late
    public String getPresentacion()
    {
        return this.presentacion;
    }
    public void setPresentacion(String presentacion)
    {
        this.presentacion = presentacion;
    }
    public String getCantidadLate()
    {
        return this.cantidadLate;
    }
    public void setCantidadLate(String cantidadLate)
    {
        this.cantidadLate = cantidadLate;
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
