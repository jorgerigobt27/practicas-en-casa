package ar.com.educacionit.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * Clase DAO empleado: permite abm de empleados.
 * Representa a la tabla empleados
 *
 */
public class Persona {

	private Long id;

	private String nombre;

	private String apellido;

	private Double remuneracion;

	public Persona(String nombre, String apellido, Double remuneracion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.remuneracion = remuneracion;
	}
	
	public Persona(Long id, String nombre, String apellido, Double remuneracion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.remuneracion = remuneracion;
	}

	public static Persona obteberPorId(Long empleadoId, Connection con) throws Exception {
		
		PreparedStatement pst = con.prepareStatement("select * from empleados where id=?");
		
		pst.setLong(1, empleadoId);
		
		ResultSet resul = pst.executeQuery();
		
		//voy a retornar una persona
		Persona e = null;
		
		//hay datos???
		if(resul.next()) {
			e = new Persona(resul.getLong(1), resul.getString(2), resul.getString(3), resul.getDouble(4));
		}
		
		//cierra la quiery
		pst.close();
		
		return e;
	}
	
	public void insertar(Connection c) throws Exception {
		// Arma la sentencia de inserción y la ejecuta
		String laInsercion =
		"INSERT INTO empleados (nombre, apellido, remuneracion) "+
		"VALUES('" + this.getNombre() + "','" + this.getApellido() + "', " +
		this.getRemuneracion() + ")";
		
		Statement stmtInsercion = c.createStatement();
		
		stmtInsercion.execute(laInsercion);
		
		// Cierra el Statement
		stmtInsercion.close();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Double getRemuneracion() {
		return remuneracion;
	}

	public void setRemuneracion(Double remuneracion) {
		this.remuneracion = remuneracion;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", remuneracion=" + remuneracion
				+ "]";
	}

}
