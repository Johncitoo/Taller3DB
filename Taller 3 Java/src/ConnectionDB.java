import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static final String URL = "jdbc:postgresql://localhost:5432/Taller 3_2"; // Ajusta si no renombraste la base
    private static final String USUARIO = "postgres"; // Usuario de PostgreSQL
    private static final String CONTRASENA = "112002"; // Tu contraseña aquí

    public static Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("¡Conexion exitosa a la base de datos!");
        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    }
}