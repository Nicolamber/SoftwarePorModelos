package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table (name = "factura")
public class Factura implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numero")
	private int numero;
	
	@Column(name = "fecha")
	private String fecha;
	
	@Column(name = "total")
	private int total;
	
	@ManyToOne (cascade = CascadeType.PERSIST)
	@JoinColumn(name = "fk_cliente")
	private Cliente cliente;
	
	//OneToMany Unidireccional (se crea una tabla intermedia)
	//@OneToMany (cascade = CascadeType.ALL, orphanRemoval = true) //Composicion , orphanRemoval en true permitira elimar un detalle cuando se elimine una factura
	//private List <DetalleFactura> detalle = new ArrayList<DetalleFactura>();
	
	//OneToMany Bidireccional
	@OneToMany (mappedBy = "factura", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DetalleFactura> detalleFactura = new ArrayList<DetalleFactura>();
	
	
	//CONSTRUCTOR
	public Factura() {}
	
	
	public Factura(int numero, String fecha, int total) {
		this.numero = numero;
		this.fecha = fecha;
		this.total = total;
	}

	

	public Factura(int numero, String fecha, int total, Cliente cliente) {
		this.numero = numero;
		this.fecha = fecha;
		this.total = total;
		this.cliente = cliente;
	}

	

	public Factura(int numero, String fecha, int total, Cliente cliente, List<DetalleFactura> detalleFactura) {
		this.numero = numero;
		this.fecha = fecha;
		this.total = total;
		this.cliente = cliente;
		this.detalleFactura = detalleFactura;
	}


	//GETTER and SETTER

	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<DetalleFactura> getDetalleFactura() {
		return detalleFactura;
	}


	public void setDetalleFactura(List<DetalleFactura> detalleFactura) {
		this.detalleFactura = detalleFactura;
	};
	
	
	
}
