
public class Lista_Producto {
	private int id;
	private String nombre;
	private String marca;
	private String descricion;
	private double precio;
	private String categoria;
	private date fecha_venc;
	private int stock;
	public Lista_Producto(int id, String nombre, String marca, String descricion, double precio, String categoria,
			date fecha_venc, int stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.descricion = descricion;
		this.precio = precio;
		this.categoria = categoria;
		this.fecha_venc = fecha_venc;
		this.stock = stock;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getDescricion() {
		return descricion;
	}
	public void setDescricion(String descricion) {
		this.descricion = descricion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public date getFecha_venc() {
		return fecha_venc;
	}
	public void setFecha_venc(date fecha_venc) {
		this.fecha_venc = fecha_venc;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	
}
