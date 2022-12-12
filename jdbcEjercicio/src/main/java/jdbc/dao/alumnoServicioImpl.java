package jdbc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class alumnoServicioImpl implements alumnoServicio{
	
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insertar(alumno a) {
		Connection conexion=null;
		try {
			conexion = dataSource.getConnection();
			Statement declaracionSQL;
			

			try {

				
				declaracionSQL = conexion.createStatement();
				
				declaracionSQL.execute("INSERT INTO \"alumnos\" ( nombre, apellidos, email) VALUES ('Juan', 'Blanco', 'pabloblanco@gmail.com');");
				

				System.out.println("[INFORMACIÓN-consultasPostgreSQL-insertAlumnos] Cierre conexión, declaración y resultado");
				declaracionSQL.close();
				

			} catch (SQLException e) {

				System.out.println("[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
				

			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
