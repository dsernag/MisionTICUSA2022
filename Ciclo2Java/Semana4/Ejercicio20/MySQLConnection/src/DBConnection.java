import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase diseñada para establecer conexión con la base de datos
 * @author daseg
 */
public class DBConnection {
    /**
     * Método estático para no tener que instanciar la clase en el main
     * @return 
     */
    public static Connection getConnection() {
        Connection con = null;
        String usuario = "root";
        String clave = "123456789";
        String url = "jdbc:mysql://localhost:3306/fabrica";
        try {
            con = DriverManager.getConnection(url, usuario, clave);
            if (con != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }
}
