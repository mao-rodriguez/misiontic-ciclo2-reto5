package model.vo;

public class LiderApellidoVo {
    //su codigo
    private int id_lider;
    private String nombre;
    private String primer_apellido;

    public LiderApellidoVo(){}

    public LiderApellidoVo(int id_lider, String nombre, String primer_apellido) {
        this.id_lider = id_lider;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
    }

    public int getId_lider() {
        return id_lider;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

}
