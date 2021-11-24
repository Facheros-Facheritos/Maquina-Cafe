package CapaNegocio;

public class DepositoMonedaTipo extends DepositoMonedas
{
    private String denominacion;

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    
    public String VerificarMoneda()
    {
        return "El metodo verificar moneda recien sera implementado";
    }
    
    public String DevolverMoneda()
    {
        return "El metodo devolver moneda recien sera implementado";
    }
}
