package model.vo;

public class Requerimiento2 {
    //Su codigo
    private int id_proyecto;
    private String constructora;
    private String ciudad;
    private int estrato;
    
    public Requerimiento2(){}

    public Requerimiento2(int id_proyecto, String constructora, String ciudad, int estrato) {
        this.id_proyecto = id_proyecto;
        this.constructora = constructora;
        this.ciudad = ciudad;
        this.estrato = estrato;
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getEstrato() {
        return estrato;
    }

}
