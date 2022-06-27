package models;

public class mediosPago {
	//atributos
	private int idMediosPago;
	private String nombre;
	//contructores
	public mediosPago(int idMediosPago, String nombre) {
		super();
		this.idMediosPago = idMediosPago;
		this.nombre = nombre;
	}
	public mediosPago() {
		super();
	}
	//getters and setters
	public int getIdMediosPago() {
		return idMediosPago;
	}
	public void setIdMediosPago(int idMediosPago) {
		this.idMediosPago = idMediosPago;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//metodos
	@Override
	public String toString() {
		return "mediosPago [idMediosPago=" + idMediosPago + ", nombre=" + nombre + "]";
	}
	

}
