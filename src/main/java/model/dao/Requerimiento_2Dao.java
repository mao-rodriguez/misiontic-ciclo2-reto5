package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.Requerimiento2;

public class Requerimiento_2Dao {
   
    public ArrayList<Requerimiento2> requerimiento2() throws SQLException {
        // Su código
        String sql = "SELECT p.ID_Proyecto , p.Constructora , p.Ciudad ,t.Estrato FROM Proyecto p INNER JOIN Tipo t ON t.ID_Tipo = p.ID_Tipo WHERE p.Ciudad = 'Cartagena' ORDER BY t.Estrato ASC;";
        ArrayList<Requerimiento2> ListObjects = new ArrayList<Requerimiento2>();

        try (
            Connection conn = JDBCUtilities.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rSet = stmt.executeQuery();
            ){
            while(rSet.next()){
                Requerimiento2 requerimiento2 = new Requerimiento2(
                    rSet.getInt("ID_Proyecto"),
                    rSet.getString("Constructora"),
                    rSet.getString("Ciudad"),
                    rSet.getInt("Estrato")
                );
                ListObjects.add(requerimiento2);
            }
            

        } catch (Exception e) {
            System.err.println("Error consultando requerimiento_2Dao: " + e);
        }
        

        return ListObjects;
    }
        
}
