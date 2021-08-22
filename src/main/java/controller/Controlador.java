package controller;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

//Modelos (acceso y objetos contenedores)
import model.dao.LiderDao;
import model.dao.ConstructoraDao;
import model.dao.LiderApellidoDao;
import model.vo.LiderVo;
import model.vo.ConstructoraVo;
import model.vo.LiderApellidoVo;


//Librerías para bases de datos
import java.sql.SQLException;

public class Controlador {
    //Su codigo
    private final LiderDao requerimiento_1dao;
    private final ConstructoraDao requerimiento_2dao;
    private final LiderApellidoDao requerimiento_3dao;
    
    public Controlador(){
        //Su codigo
        this.requerimiento_1dao = new LiderDao();
        this.requerimiento_2dao = new ConstructoraDao();
        this.requerimiento_3dao = new LiderApellidoDao();

    }

    public ArrayList<LiderVo> consultarRequerimiento_1() throws SQLException {
        
        return this.requerimiento_1dao.requerimiento1();
    }
    
    public ArrayList<ConstructoraVo> consultarRequerimiento_2() throws SQLException {
        //Su codigo
        return this.requerimiento_2dao.requerimiento2();
    }

    public ArrayList<LiderApellidoVo> consultarRequerimiento_3() throws SQLException {
        //Su codigo
        return this.requerimiento_3dao.requerimiento3();
    }
}
