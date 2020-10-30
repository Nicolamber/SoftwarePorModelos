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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity //Decimos que Cliente es una entidad
@Table (name = "cliente") // Decimos que la tabla se llamará cliente
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) //Generamos Id autoincrementable
	private Long id;
	
	@Column(name = "nombre") // Decimos que nombre es una columna
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "dni", unique = true) //Decimps que dni es unico
	private int dni;
	
	@OneToOne(cascade = CascadeType.ALL) //Mapeo la relacion, cualquier cambio que yo realiace en el cliente se mapea el domicilio
	@JoinColumn (name = "fk_domicilio")//Crear columna que tendra la clave foranea de domicilio
	private Domicilio domicilio;
	
	
	@OneToMany(mappedBy = "cliente") //Nombre de la relacion dentro de la clase factura
	private List <Factura> factura = new ArrayList<Factura>();
	
	//CONSTRUCTOR
	public Cliente() {};
	public Cliente(String nombre, String apellido, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	
	public Cliente(String nombre, String apellido, int dni, Domicilio domicilio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
	}
	
	
	public Cliente(String nombre, String apellido, int dni, Domicilio domicilio, List<Factura> factura) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
		this.factura = factura;
	}
	//GETTER and SETTER
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	public List<Factura> getFactura() {
		return factura;
	}
	public void setFactura(List<Factura> factura) {
		this.factura = factura;
	}
	
	
	

}

