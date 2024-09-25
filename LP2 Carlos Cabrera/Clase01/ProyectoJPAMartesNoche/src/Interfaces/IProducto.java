package Interfaces;

import java.util.List;

import model.TblCliente;
import model.TblProducto;

public interface IProducto {

	//Declaraci�n de m�todos
		void RegistrarProducto(TblProducto producto);
		void ActualizarProducto(TblProducto producto);
		void EliminarProducto(TblProducto producto);
		List<TblProducto> ListadoProducto();
		TblProducto BusacrProducto(TblProducto producto);
	
}//Fin de interface Producto
