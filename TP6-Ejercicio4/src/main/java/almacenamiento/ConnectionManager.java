package almacenamiento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectionManager {

    public static Connection getConexion(String urlDB) throws SQLException {

	Connection conn = null;

	conn = DriverManager.getConnection(urlDB);

	return conn;
    }

}
