package view;

import controller.ControladorRequerimientosReto4;

import model.vo.Requerimiento1;
import model.vo.Requerimiento2;
import model.vo.Requerimiento3;


import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4 {
    
    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();
    
    public static void requerimiento1(){
        System.out.println("*** Lideres por Salario ***");
        

        try{
            ArrayList<Requerimiento1> listaConsulta = controlador.consultarRequerimiento_1();

            for (Requerimiento1 requerimiento1 : listaConsulta) {
                System.out.printf("El lider %s %s con Id %d Tiene un salario de %d",
                requerimiento1.getNombre(),
                requerimiento1.getPrimer_apellido(),
                requerimiento1.getId_lider(),
                (int)requerimiento1.getSalario()
                );
                System.out.println();
            }
            

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento2(){     

        System.out.println("*** Proyectos por Tipo ***");

        try{
            ArrayList<Requerimiento2> listaConsulta = controlador.consultarRequerimiento_2();

            for (Requerimiento2 requerimiento2 : listaConsulta) {
                System.out.printf("El proyecto de ID_Proyecto %d de la constructora: %s de la ciudad %s, tiene un estrato asignado de %s",
                requerimiento2.getId_proyecto(),
                requerimiento2.getConstructora(),
                requerimiento2.getCiudad(),
                requerimiento2.getEstrato()
                );
                System.out.println();
            }
            

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento3(){

        System.out.println("*** Lideres por Nombre ***");

        try{
            ArrayList<Requerimiento3> listaConsulta = controlador.consultarRequerimiento_3();

            for (Requerimiento3 requerimiento3 : listaConsulta) {
                System.out.printf("El Lider con Id %d se llama %s %s",
                requerimiento3.getId_lider(),
                requerimiento3.getNombre(),
                requerimiento3.getPrimer_apellido()
                );
                System.out.println();
            }
            

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

}
