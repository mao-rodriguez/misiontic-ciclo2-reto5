package model.vo;

public class Requerimiento1 {
    //Su codigo
    private int id_lider;
    private String nombre;
    private String primer_apellido;
    private double salario;

    public Requerimiento1(){
        
    }
    
    public Requerimiento1(int id_lider, String nombre, String primer_apellido, double salario) {
        this.id_lider = id_lider;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }
}
