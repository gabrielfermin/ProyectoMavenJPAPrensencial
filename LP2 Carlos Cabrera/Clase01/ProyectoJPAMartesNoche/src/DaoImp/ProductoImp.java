package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProducto;

public class ProductoImp implements IProducto {

	@Override
	public void RegistrarProducto(TblProducto producto) {
		//Nos conoctemos co al unidad de persistencia para elnviar datos
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMartesNoche");
				EntityManager em=emf.createEntityManager();
				
				try{
				//Inicair transaccion
					em.getTransaction().begin();
				//Invocamos el método persis persit 
				//para guardar datos en la BD
					em.persist(producto);
				//Confirmando tranzacion
					em.getTransaction().commit();
				}catch(RuntimeException e){
					e.getMessage();
				}finally{
				
				//Cerramos la tranzacion
				em.close();
		
				}
				
	}//FIN DEL METODO Registrar Producto

	@Override
	public void ActualizarProducto(TblProducto producto) {
		
		
	}

	@Override
	public void EliminarProducto(TblProducto producto) {
		
		
	}

	@Override
	public List<TblProducto> ListadoProducto() {
		
		return null;
	}

	@Override
	public TblProducto BusacrProducto(TblProducto producto) {
	
		return null;
	}

	
	
}//Fin de la clase 
