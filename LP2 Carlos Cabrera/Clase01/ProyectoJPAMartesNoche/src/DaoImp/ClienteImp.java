package DaoImp;

//Importaciones necesarias
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



import Interfaces.IClente;
import model.TblCliente;

public class ClienteImp implements IClente {

	@Override
	public void RegistrarCliente(TblCliente cliente) {
		
		//Nos conoctemos co al unidad de persistencia para elnviar datos
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMartesNoche");
		EntityManager em=emf.createEntityManager();
		
		try{
		//Inicair transaccion
			em.getTransaction().begin();
		//Invocamos el m todo persis persit 
		//para guardar datos en la BD
			em.persist(cliente);
		//Confirmando tranzacion
			em.getTransaction().commit();
		}catch(RuntimeException e){
			e.getMessage();
		}finally{
		
		//Cerramos la tranzacion
		em.close();
	}
	}//Fin del m todo Registrar Cliente

	
	@Override
	public void ActualizarCliente(TblCliente cliente) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMartesNoche");
		EntityManager em=emf.createEntityManager();
		try {
		//Nos conectamos a la unidad de persistencia
			//para actualizar los datos de la BD
			//niciamops la tranzaicion
			em.getTransaction().begin();
			//Invocamos m todo de actualizar
			em.merge(cliente);
			//confirmamos tranzacci n
			em.getTransaction().commit();
			
		} catch (RuntimeException e) {
			e.getMessage();
		}
			finally {
				//cerramos
				em.close();
			}
		
		
	}//Fin del m todo Actualizar Cliente

	
	@Override
	public void EliminarCliente(TblCliente cliente) {
		
		/*
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoJPAMartesNoche");
		EntityManager em = emf.createEntityManager();
		try {
			//Iniciamos la Transacción
			em.getTransaction().begin();
			
			// Buscamos el cliente en la base de datos
			TblCliente clienteExiste = em.find(TblCliente.class, cliente.getIdcliente());
			
	        if(clienteExiste !=null){
	        //Eliminar Clinete
	        	em.remove(clienteExiste);
	        	
	        //Confirmar Transacción
	        	em.getTransaction().commit();
	        	System.out.print("Cliente Eliminado de la BD");
	        	
	        }
	        
	        else{
	        	System.out.print("Cliente NO encontrado\n ");
	        }
	       
			
		}
		
		
		catch (RuntimeException e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		
		}finally{
			em.close();
		}
		
		
		*/
		
		
		//conectamos con la unidad de persistencia 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoJPAMartesNoche");
		//Para administra la Transasción
		EntityManager em = emf.createEntityManager();
		try {
			//Iniciando la Transacción
			em.getTransaction().begin();
			//recuperamos el codigo a eliminar
			TblCliente elimcli= em.find(TblCliente.class, cliente.getIdcliente());
			//Aplicamos una condición
			if(elimcli !=null){
			//Procedemos a eliminar
				em.remove(elimcli);
			//Confirmamos 
			em.getTransaction().commit();
			}	
			
		} catch (RuntimeException e) {
			//Condición
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
		
		}finally {
			em.close();
		}
		
		
	}//Fin del método Eliminar Cliente

	
	@Override
	public List<TblCliente> ListadoCliente() {
		//conectamos con la unidad de persistencia 
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoJPAMartesNoche");
				//Para administra la Transasción
				EntityManager em = emf.createEntityManager();
				List<TblCliente> listado = null;
				try {
					//Iniciar la Transacción
					em.getTransaction().begin();
					//Aplicamos consulta JPA
					listado=em.createQuery("select c from TblCliente c",TblCliente.class).getResultList();
				
					//Confirmamos 
					em.getTransaction().commit();
					
					
				
				}catch(RuntimeException ex){
					ex.getMessage();
				}
				finally {
					em.close();
				}
				
				return listado;
	

		
	}//Fin del m todo Listar Cliente

	
	
	@Override
	public TblCliente BusacrCliente(TblCliente cliente) {
		
		//conectamos con la unidad de persistencia 
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoJPAMartesNoche");
				//Para administra la Transasción
				EntityManager em = emf.createEntityManager();
				
				TblCliente  tblCli =null;
		try{
				//Iniciar tRansacción
				em.getTransaction().begin();
				tblCli=em.find(TblCliente.class,cliente.getIdcliente());
				//Confirmamos Transacción
				em.getTransaction().commit();
				
				//retornamos el cliente
		}catch(RuntimeException e){
			e.getMessage();
		}finally {
			//cerramos 
			em.close();
		}
		return tblCli;
	}//Fin del m todo Buscar Cliente

	
	
}//FIN de la clase
