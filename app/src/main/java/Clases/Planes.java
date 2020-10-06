package Clases;

public class Planes
{
    //Declaracion de Datos

    private String xtreme;
    private String mindfullness;

    //Constructor
    public Planes()
    {
        xtreme ="12000";
        mindfullness = "24000";
    }

    //Accesadores

    public String getXtreme() {
        return xtreme;
    }

    public String getMindfullness() {
        return mindfullness;
    }

    public void setMindfullness(String mindfullness) {
        this.mindfullness = mindfullness;
    }

    public void setXtreme(String xtreme) {
        this.xtreme = xtreme;
    }
}
