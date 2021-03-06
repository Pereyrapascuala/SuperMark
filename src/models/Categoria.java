package models;

public class Categoria {

	//atributos
	private int id_categoria;
	private String nombre;
	//constructores
	public Categoria(int id_categoria, String nombre) {
		super();
		this.id_categoria = id_categoria;
		this.nombre = nombre;
	}
	
	public Categoria() {
		super();
	}
	

	public Categoria(int id_categoria) {
		super();
		this.id_categoria = id_categoria;
	}

	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Categoria [id_categoria=" + id_categoria + ", nombre=" + nombre + "]";
	}
	
	
}
