package controller;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

//Modelos (acceso y objetos contenedores)
import model.dao.Requerimiento_1Dao;
import model.dao.Requerimiento_2Dao;
import model.dao.Requerimiento_3Dao;
import model.vo.Requerimiento1;
import model.vo.Requerimiento2;
import model.vo.Requerimiento3;


//Librerías para bases de datos
import java.sql.SQLException;

public class ControladorRequerimientosReto4 {
    //Su codigo
    private final Requerimiento_1Dao requerimiento_1dao;
    private final Requerimiento_2Dao requerimiento_2dao;
    private final Requerimiento_3Dao requerimiento_3dao;
    
    public ControladorRequerimientosReto4(){
        //Su codigo
        this.requerimiento_1dao = new Requerimiento_1Dao();
        this.requerimiento_2dao = new Requerimiento_2Dao();
        this.requerimiento_3dao = new Requerimiento_3Dao();

    }

    public ArrayList<Requerimiento1> consultarRequerimiento_1() throws SQLException {
        
        return this.requerimiento_1dao.requerimiento1();
    }
    
    public ArrayList<Requerimiento2> consultarRequerimiento_2() throws SQLException {
        //Su codigo
        return this.requerimiento_2dao.requerimiento2();
    }

    public ArrayList<Requerimiento3> consultarRequerimiento_3() throws SQLException {
        //Su codigo
        return this.requerimiento_3dao.requerimiento3();
    }

}
