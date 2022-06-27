package models;

public class Productos {
	//atributos
	private int idProducto;
	private Categorias idCategoria;
	private String descripcion;
	private String nombre;
	private String marca;
	private int stock;
	private double costo;
	private double precioVenta;
	private  int fechaVencimiento;
	//contructores
	public Productos(int idProducto, Categorias idCategoria, String descripcion, String nombre, String marca, int stock,
			double costo, double precioVenta, int fechaVencimiento) {
		super();
		this.idProducto = idProducto;
		this.idCategoria = idCategoria;
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.marca = marca;
		this.stock = stock;
		this.costo = costo;
		this.precioVenta = precioVenta;
		this.fechaVencimiento = fechaVencimiento;
	}
	public Productos() {
		super();
	}
	//setters and getters
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public Categorias getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Categorias idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public int getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(int fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	//metodos
	@Override
	public String toString() {
		return "Productos [idProducto=" + idProducto + ", idCategoria=" + idCategoria + ", descripcion=" + descripcion
				+ ", nombre=" + nombre + ", marca=" + marca + ", stock=" + stock + ", costo=" + costo + ", precioVenta="
				+ precioVenta + ", fechaVencimiento=" + fechaVencimiento + "]";
	}
	
	

}
