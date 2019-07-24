
package JavaStandard.Clase6.main;
import java.sql.Connection;

import JavaStandard.Clase6.database.AdministradorDeConexiones;
import JavaStandard.Clase6.domain.Persona;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) throws Exception {
		
		Connection con = AdministradorDeConexiones.obtenerConexion();
		//con.setAutoCommit(false);
		
		//Persona e = new Persona("juan", "perez", 10000D);
		
		//e.insertar(con);
	
		Long idEmpleadoBuscado = new Long(1);
		
		Persona empleadoBuscado = Persona.obteberPorId(idEmpleadoBuscado, con);
				
		if(empleadoBuscado != null) {
			System.out.println(empleadoBuscado);
		}else {
			System.out.println("Empleado buscado con id=" + idEmpleadoBuscado + "no existe");
		}
		
                //SE MODIFICA EL EMPLEADO BUSCADO
		empleadoBuscado.setRemuneracion(10000D);
                empleadoBuscado.modificar(con);
                
                //SE IMPRIME EL EMPLEADO MODIFICADO
                if(empleadoBuscado != null) {
			System.out.println(empleadoBuscado);
		}else {
			System.out.println("Empleado buscado con id=" + idEmpleadoBuscado + "no existe");
		}
                
                //SE ELIMINA EL EMPLEADO
                empleadoBuscado.eliminar(idEmpleadoBuscado, con);
                
                
		//con.rollback();
		//con.commit();
		
		con.close();
	}
}