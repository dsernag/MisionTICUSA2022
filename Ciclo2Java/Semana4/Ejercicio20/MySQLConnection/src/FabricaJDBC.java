
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase Fabrica JDBC para implementar funciones CRUD
 *
 * @author daseg
 */
public class FabricaJDBC {

    /**
     * Crea una nueva fila (numero_fabrica) se autoincrementa
     *
     * @param db Conexión a la base de datos
     * @param cantidad_empleados
     * @param Pais
     * @param gerente
     */
    public static void Create(Connection db, int cantidad_empleados, String Pais, String gerente) {
        String busqueda_create = "INSERT INTO fabrica(cantidad_empleados, pais, gerente) VALUES (?, ?, ?)";
        PreparedStatement busqueda;
        try {
            busqueda = db.prepareStatement(busqueda_create);
            busqueda.setInt(1, cantidad_empleados);
            busqueda.setString(2, Pais);
            busqueda.setString(3, gerente);
            int filasAgregadas = busqueda.executeUpdate();
            if (filasAgregadas > 0) {
                System.out.println("Insersición exitosa\n");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FabricaJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Devuelve una impresión de la base de datos
     *
     * @param db
     */
    public static void Retrieve(Connection db) {
        String busqueda_retrieve = "SELECT * FROM fabrica";
        PreparedStatement busqueda;
        try {
            busqueda = db.prepareStatement(busqueda_retrieve);
            ResultSet resultados = busqueda.executeQuery(busqueda_retrieve);
            System.out.println("numero_fabrica | cantidad_empleados | pais | gerente");
            while (resultados.next()) {
                int numero_fabrica = resultados.getInt("numero_fabrica");
                int cantidad_empleados = resultados.getInt("cantidad_empleados");
                String pais = resultados.getString("pais");
                String gerente = resultados.getString("gerente");
                System.out.println(numero_fabrica + " | " + cantidad_empleados + " | " + pais + " | " + gerente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FabricaJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Unicamente permite modificar la cantidad de empleados
     * @param db Conexión a la base de datos
     * @param numero_fabrica Para encontrar a cuál fila se le hará la update
     * @param cantidad_empleados Cantidad de empleados para modificar
     */
    public static void Update(Connection db, int numero_fabrica, int cantidad_empleados) {
        String busqueda_update = "UPDATE fabrica SET cantidad_empleados = ? WHERE numero_fabrica = ?";
        try {
            PreparedStatement busqueda = db.prepareStatement(busqueda_update);
            busqueda.setInt(1, cantidad_empleados);
            busqueda.setInt(2, numero_fabrica);
            int filasAgregadas = busqueda.executeUpdate();
            if (filasAgregadas > 0) {
                System.out.println("Modificación exitosa\n");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FabricaJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void Delete(Connection db, int numero_fabrica) {
        String busqueda_update = "DELETE FROM fabrica WHERE numero_fabrica = ?";
        try {
            PreparedStatement busqueda = db.prepareStatement(busqueda_update);
            busqueda.setInt(1, numero_fabrica);
            int filasAgregadas = busqueda.executeUpdate();
            if (filasAgregadas > 0) {
                System.out.println("Eliminación exitosa\n");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FabricaJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
