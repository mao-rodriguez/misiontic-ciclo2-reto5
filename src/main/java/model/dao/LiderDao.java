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
import model.vo.LiderVo;

public class LiderDao {
    
    public ArrayList<LiderVo> requerimiento1() throws SQLException {
        // Su código
        String sql = "SELECT l.ID_Lider, l.Nombre, l.Primer_Apellido, l.Salario FROM Lider l WHERE l.Salario <= 500000 ORDER BY l.Salario ASC;";
        ArrayList<LiderVo> ListObjects = new ArrayList<LiderVo>();

        try (
            Connection conn = JDBCUtilities.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rSet = stmt.executeQuery();
            ){
            while(rSet.next()){
                LiderVo requerimiento1 = new LiderVo(
                    rSet.getInt("ID_Lider"),
                    rSet.getString("Nombre"),
                    rSet.getString("Primer_Apellido"),
                    rSet.getDouble("Salario")
                );
                ListObjects.add(requerimiento1);
            }
        } catch (Exception e) {
            System.err.println("Error consultando requerimiento_1Dao: " + e);
        }
        return ListObjects;
    }
}
