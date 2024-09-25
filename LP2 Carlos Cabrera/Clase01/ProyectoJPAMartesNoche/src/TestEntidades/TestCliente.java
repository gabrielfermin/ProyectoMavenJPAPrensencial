package TestEntidades;


import java.util.List;

import DaoImp.ClienteImp;
import model.TblCliente;

public class TestCliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
	//Instanciamos  las respectivas clase
		TblCliente tblcli= new TblCliente();
		ClienteImp cliimp= new ClienteImp();
		
		//Asignamos valores que sean registrados en al BD
		tblcli.setNombre("Camila");
		tblcli.setApellido("Ramirez");
		tblcli.setSexo("F");
		tblcli.setDni("936214526");
		tblcli.setEmail("camila@gmail.com");
		tblcli.setTelef("915926348");
		
		//invocamos los m todos registrar
		cliimp.RegistrarCliente(tblcli);
		
		//emitimos mensaje por consola
		 System.out.print("Datos Registrados en la BD"); 
		*/
		//======================================================================================================
		/*
		//Test Actualizar Cliente
		
		TblCliente tblcli= new TblCliente();
		ClienteImp cliimp= new ClienteImp();
		
		tblcli.setIdcliente(1);
		tblcli.setNombre("Emilio");
		tblcli.setApellido("Bernales");
		tblcli.setSexo("M");
		tblcli.setDni("784521369");
		tblcli.setEmail("juan@gmail.com");
		tblcli.setTelef("987456325");
		cliimp.ActualizarCliente(tblcli);
		
		
		System.out.print("Datos Actualizado en la BD");
		*/
		//========================================================================================================
		
		
		//Borrar Cliente de la BD por código
		/*
		TblCliente tblcli = new TblCliente();
		ClienteImp cliimp = new ClienteImp();
		
		tblcli.setIdcliente(1);
		
		cliimp.EliminarCliente(tblcli);
		
		System.out.print("Cliente Eliminado de la BD");
		*/
		//========================================================================================================
			//Listar Clietes
		/*
		TblCliente tblcli = new TblCliente();
		ClienteImp cliimp = new ClienteImp();
		
		List<TblCliente> listado=cliimp.ListadoCliente();
		//Aplicamos un bucle
		for(TblCliente lis:listado){
			//Imprimimos por pantalla
			System.out.print("nombre\n"+lis.getNombre()+
			"apellido\n"+lis.getApellido()+
			"sexo\n"+lis.getSexo()+
			"email\n"+lis.getDni()+
			"elef\n"+lis.getTelef());
			
			
		}
		*/

		//========================================================================================================
		TblCliente tblcli = new TblCliente();
		ClienteImp cliimp = new ClienteImp();
		
        tblcli.setIdcliente(3);
		TblCliente cliente=cliimp.BusacrCliente(tblcli);
		
		System.out.print("nombre \n\n"+cliente.getNombre()+"\n"+
				"apellido \n\n"+cliente.getApellido()+"\n"+
				"sexo \n\n"+cliente.getSexo()+"\n"+
				"email \n\n"+cliente.getDni()+"\n"+
				"elef \n\n"+cliente.getTelef());
		
	
		
		//========================================================================================================
		
	}//FIN del método principal

}//FIN DE LA CLASE
