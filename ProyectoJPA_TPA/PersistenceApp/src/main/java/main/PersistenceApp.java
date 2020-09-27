package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Articulo;
import entidades.Categoria;
import entidades.Cliente;
import entidades.DetalleFactura;
import entidades.Domicilio;
import entidades.Factura;

public class PersistenceApp {
	public static void main (String[]args) {
		//Generar una conexión de la App con la unidad de persistencia, JPA nos provee EntityManagerFactory
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceAppPU");
		EntityManager em = emf.createEntityManager(); // instanciamos EntityManagerFactory
		
		//Usamos excepciones
		
		try {
			//Iniciar transaccion
			em.getTransaction().begin();
			
//Cliente cliente = new Cliente("Antonella", "Canessa",12345678);
//Domicilio domicilio = new Domicilio("Rodriguez",273); 
//cliente.setDomicilio(domicilio);
//domicilio.setCliente(cliente);
			
//Persistir cliente en la bd
//em.persist(cliente);
		
//Domicilio dom = em.find(Domicilio.class, 1L);
//Cliente cliente= em.find(Cliente.class, 1L);
//			
//System.out.println("Cliente de domicilio: "+dom.getCliente().getDni());
//System.out.println("Domicilio de cliente: "+cliente.getDomicilio().getNombreCalle());
			
					
			
			Factura factura1 = new Factura();
			Domicilio domicilio = new Domicilio("Avenida siempre viva",123);
			Cliente cliente = new Cliente("Antonella", "Canessa",123456789);
			
			DetalleFactura detalle1 = new DetalleFactura();
			DetalleFactura detalle2 = new DetalleFactura();
			
			Categoria perecederos = new Categoria("Perecederos");
			Categoria lacteos = new Categoria("Lacteos");
			Categoria limpieza = new Categoria("Limpieza");
			
			Articulo articulo1 = new Articulo("Yogures",200,60);
			Articulo articulo2 = new Articulo("Escoba",15,280);
			
			//Asignar categoria a los articulos 
			articulo1.getCategorias().add(lacteos);
			articulo1.getCategorias().add(perecederos);
			
			articulo2.getCategorias().add(limpieza);
			
			
			//Agregarle a las categorias los articulos
			perecederos.getArticulos().add(articulo1);
			lacteos.getArticulos().add(articulo1);			
			
			limpieza.getArticulos().add(articulo2);
			
			
			
			detalle1.setArticulo(articulo1);
			detalle1.setCantidad(2);
			detalle1.setSubtotal(120);
			detalle1.setFactura(factura1); //Bidereccionalidad
			
			
			detalle2.setArticulo(articulo2);
			detalle2.setCantidad(1);
			detalle2.setSubtotal(280);
			detalle2.setFactura(factura1); //Bidereccionalidad
			
			
			//Relaciones
			articulo1.getDetalleFactura().add(detalle1);
			articulo2.getDetalleFactura().add(detalle2);
			
			cliente.setDomicilio(domicilio);
			domicilio.setCliente(cliente);
			
			
			factura1.setNumero(123);
			factura1.setFecha("26/08/2020");
			factura1.setCliente(cliente);
			factura1.setCliente(cliente);
			factura1.getDetalleFactura().add(detalle1);
			factura1.getDetalleFactura().add(detalle2);
			factura1.setTotal(400);
			
			
			//Persistir FACTURA
			em.persist(factura1);
			
			//Limpiar conexion			
			em.flush();
			
			//Commit del persist
			em.getTransaction().commit();
		
		} catch (Exception e) {
			//Hacemos rollback para volver a un estado anterior
			
			em.getTransaction().rollback();
			
		}
		
		//Cerramos conexion con EntityManager
		em.close();
		
		//Cerramos conexion con EntityManagerFactory
		emf.close();
		

}
}
