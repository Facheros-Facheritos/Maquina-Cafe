package CapaNegocio;

public class CafeTinto extends Producto
{
    private String grande;
    private String mediano;
    private String pequeño;

    public String getGrande() {
        return grande;
    }

    public void setGrande(String grande) {
        this.grande = grande;
    }

    public String getMediano() {
        return mediano;
    }

    public void setMediano(String mediano) {
        this.mediano = mediano;
    }     
    public String getPequeño() {
        return pequeño;
    }

    public void setPequeño(String pequeño) {
        this.pequeño = pequeño;
    }
        
    public String Calentar()
    {
        return "El calentar no esta implementado";
    }
}
