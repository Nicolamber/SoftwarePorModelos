package entidades;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table (name = "detalleFactura")
public class DetalleFactura implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "subtotal")
	private int subtotal;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "fk_articulo")
	private Articulo articulo ;
	
	
	//OneToMany Bidereccional --> ManyToOne
	@ManyToOne (cascade =CascadeType.PERSIST)
	@JoinColumn(name="fk_factura")
	private Factura factura;
	
	//CONSTRUCTOR
	public DetalleFactura() {};
	
	public DetalleFactura(int cantidad, int subtotal) {
		this.cantidad = cantidad;
		this.subtotal = subtotal;
	}
	
	
	public DetalleFactura(int cantidad, int subtotal, Articulo articulo) {
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.articulo = articulo;
	}
	 

	public DetalleFactura(int cantidad, int subtotal, Articulo articulo, Factura factura) {
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.articulo = articulo;
		this.factura = factura;
	}

	//GETTER and SETTER

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	
	
}
