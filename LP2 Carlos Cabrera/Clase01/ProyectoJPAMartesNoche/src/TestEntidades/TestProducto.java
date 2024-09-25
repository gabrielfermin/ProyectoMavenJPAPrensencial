package TestEntidades;

import DaoImp.ClienteImp;
import DaoImp.ProductoImp;
import model.TblCliente;
import model.TblProducto;

public class TestProducto {

	public static void main(String[] args){
		
		//Insatanciamos las respectivas clase
				TblProducto tblPro= new TblProducto();
				ProductoImp productoImp= new ProductoImp();
				//Asignamos valores que sean registrados en al BD
				tblPro.setNomprod("Leche");
				tblPro.setPrecio(5);
				tblPro.setCantidad(1);
				tblPro.setTotal(5);
				tblPro.setCodbarras("10101010");
				tblPro.setNrolote("N3");
				//tblPro.setFechaven("09:10:2026");
				//invocamos los métodos registrar
				productoImp.RegistrarProducto(tblPro);
				//emitimos mensaje por consola
				
		
				System.out.print("Datos registrados en la BD");
		
	}
	
}//FIN DE LA CLASE PRODUCTO
