package model.dao;

//Estructura de datos
import java.util.ArrayList;

import model.vo.Requerimiento3;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
//import model.vo.ProyectosQuibdoApartaestudio;

public class Requerimiento_3Dao {

    public ArrayList<Requerimiento3> requerimiento3() throws SQLException {
        // Su código
        String sql = "SELECT l.ID_Lider , l.Nombre , l.Primer_Apellido FROM Lider l WHERE substr(l.Primer_Apellido, -1) = 'z' ORDER BY l.Nombre ASC;";
        ArrayList<Requerimiento3> ListObjects = new ArrayList<Requerimiento3>();

        
        try (
            Connection conn = JDBCUtilities.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rSet = stmt.executeQuery();
            ){
            while(rSet.next()){
                Requerimiento3 requerimiento3 = new Requerimiento3(
                    rSet.getInt("ID_Lider"),
                    rSet.getString("Nombre"),
                    rSet.getString("Primer_Apellido")
                );
                ListObjects.add(requerimiento3);
            }
            

        } catch (Exception e) {
            System.err.println("Error consultando requerimiento_1Dao: " + e);
        }
        

        return ListObjects;
    }
}
