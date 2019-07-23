package ar.com.educacionit.main;

import java.sql.Connection;

import ar.com.educacionit.database.AdministradorDeConexiones;
import ar.com.educacionit.domain.Persona;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) throws Exception {
		
		Connection con = AdministradorDeConexiones.obtenerConexion();
		//con.setAutoCommit(false);
		
		Persona e = new Persona("carlos", "lopez", 1000D);
		
		e.insertar(con);
	
		Long idEmpleadoBuscado = new Long(3);
		
		Persona empleadoBuscado = Persona.obteberPorId(idEmpleadoBuscado, con);
				
		if(empleadoBuscado != null) {
			System.out.println(empleadoBuscado);
		}else {
			System.out.println("Empleado buscado con id=" + idEmpleadoBuscado + "no existe");
		}
		
		
		//con.rollback();
		//con.commit();
		
		con.close();
	}
}
