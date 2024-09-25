package Interfaces;
//Importaciones necesarias 
import model.TblCliente;
import java.util.List;
public interface IClente {

	//Declaración de métodos
	void RegistrarCliente(TblCliente cliente);
	void ActualizarCliente(TblCliente cliente);
	void EliminarCliente(TblCliente cliente);
	List<TblCliente> ListadoCliente();
	TblCliente BusacrCliente(TblCliente cliente);
	
}////Fin de interface Cliente
