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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table (name = "Articulo")
public class Articulo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "denominacion")
	private String denominacion;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "precio")
	private int precio;
	
	//OneToMany Bidireccional
	@OneToMany (mappedBy = "articulo", cascade = CascadeType.PERSIST)
	private List<DetalleFactura> detalleFactura = new ArrayList<DetalleFactura>();
	
	
	@ManyToMany (cascade = {CascadeType.PERSIST,CascadeType.MERGE}) //Que se persistan las categoria o que se actualicen
	//Crear tabla intermedia entre articulo y categoria
	@JoinTable (
			name = "articulo_categoria",
			joinColumns = @JoinColumn(name = "articulo_id"),
			inverseJoinColumns = @JoinColumn (name = "categoria_id"))
	private List<Categoria> categorias = new ArrayList<Categoria>();
	
	
	//CONSTRUCTOR
	public Articulo() {
		
	}


	public Articulo(String denominacion, int cantidad, int precio) {
		this.denominacion = denominacion;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	
	public Articulo(String denominacion, int cantidad, int precio, List<DetalleFactura> detalleFactura) {
		this.denominacion = denominacion;
		this.cantidad = cantidad;
		this.precio = precio;
		this.detalleFactura = detalleFactura;
	}

	

	public Articulo(String denominacion, int cantidad, int precio, List<DetalleFactura> detalleFactura,
			List<Categoria> categorias) {
	
		this.denominacion = denominacion;
		this.cantidad = cantidad;
		this.precio = precio;
		this.detalleFactura = detalleFactura;
		this.categorias = categorias;
	}


	//GETTER and SETTER


	public String getDenominacion() {
		return denominacion;
	}


	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public List<DetalleFactura> getDetalleFactura() {
		return detalleFactura;
	}


	public void setDetalleFactura(List<DetalleFactura> detalleFactura) {
		this.detalleFactura = detalleFactura;
	}


	public List<Categoria> getCategorias() {
		return categorias;
	}


	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	};
	
	
	
}
