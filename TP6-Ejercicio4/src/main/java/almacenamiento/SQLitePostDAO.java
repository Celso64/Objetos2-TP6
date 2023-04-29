package almacenamiento;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SQLitePostDAO implements PostDAO {

    private Connection conexion;

    public SQLitePostDAO(Connection conexion) {
	this.conexion = conexion;
    }

    @Override
    public void create(PostDTO post) {

	String create = "INSERT INTO post(user_id, id, title, body) VALUES (?, ?, ?, ?)";

	try (PreparedStatement st = conexion.prepareStatement(create);) {

	    st.setLong(1, post.userId());
	    st.setLong(2, post.id());
	    st.setString(3, post.title());
	    st.setString(4, post.body());

	    if (st.executeUpdate() != 1)
		throw new RuntimeException("No se pudo agregar el registro");

	} catch (Exception e) {
	    throw new RuntimeException("Error en la BD - " + e.getMessage());
	}

    }

}
