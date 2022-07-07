package models;

public class Clientes {
	//atributos
	private int idCliente;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private int dni;
	//constructores
	public Clientes(int idCliente, String nombre, String apellido, String direccion, String telefono, int dni) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.dni = dni;
	}
	public Clientes() {
		super();
	}
	//setters and getters
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	//metodos 
	@Override
	public String toString() {
		return "Clientes [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
				+ direccion + ", telefono=" + telefono + ", dni=" + dni + "]";
	}
	
	
	
	

}
