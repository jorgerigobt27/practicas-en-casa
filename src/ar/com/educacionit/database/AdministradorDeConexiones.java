package ar.com.educacionit.database;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class AdministradorDeConexiones {
	
	public static Connection obtenerConexion() throws Exception {
		
		// Establece el nombre del driver a utilizar
		String dbDriver = "com.mysql.jdbc.Driver";
	
		// Establece la conexion a utilizar
		String dbConnString = "jdbc:mysql://localhost:3306/jdbc";
		
		// Establece el usuario de la base de datos
		String dbUser = "root";
		
		// Establece la contraseña de la base de datos
		String dbPassword = "root";
		
		// Establece el driver de conexion
		Class.forName(dbDriver).newInstance();
		
		// Retorna la conexion
		return DriverManager.getConnection(dbConnString, dbUser, dbPassword);
	}
}