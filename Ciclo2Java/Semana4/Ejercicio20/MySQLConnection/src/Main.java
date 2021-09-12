
import java.sql.Connection;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author daseg
 */
public class Main {

    public static void main(String[] args) {
        // 1) Establecer la conexión
        Connection conexion = DBConnection.getConnection();
        // Ver la base de datos original:
        FabricaJDBC.Retrieve(conexion);
        
        // 2) Agregar dos registros a la base de datos:
        FabricaJDBC.Create(conexion, 300, "China", "Huan Xiomi");
        FabricaJDBC.Create(conexion, 285, "Rusia", "Vladimir Putin");
        
        // 3) Imprimir todos los registros de la base de datos:
        FabricaJDBC.Retrieve(conexion);
        
        // 4) Actualizar la cantidad de empleados del 2do elemento a 33:
        FabricaJDBC.Update(conexion, 2, 33);
        
        // 5) Eliminar alguno de los elementos
        FabricaJDBC.Delete(conexion, 1);
        
        // Ver como quedó la base de datos:
        FabricaJDBC.Retrieve(conexion);
    }
}
