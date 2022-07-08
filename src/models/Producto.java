package models;
import java.sql.Date;
import java.util.ArrayList;

public class Producto {  
	//atriburos
	
	private Categoria categoria;
	private String nombre;
	private String marca;
	private String descripcion;
	private int stock;
	private double costo;
	private double precio_venta;
	private Date fecha_vencimiento;
	
	//constructores
	public Producto( Categoria categoria, String nombre, String marca, String descripcion, int stock,
			double costo, double precio_venta, Date fecha_vencimiento ) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.stock = stock;
		this.costo = costo;
		this.precio_venta = precio_venta;
		this.fecha_vencimiento = fecha_vencimiento;
		
	}
	
	public Producto(Categoria categoria, String nombre, String marca, String descripcion, int stock,
			double precio_venta, boolean disponible) {
		super();
		this.categoria = categoria;
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		stock = stock;
		this.precio_venta = precio_venta;
	
	}

	//getter y setter
	public Producto() {
		super();
	}
	
	public Producto(String nombre2, String marca2, String descripcion2, int idcategoria, int stock2, double costo2,
			double precio_venta2, Date date) {
		// TODO Auto-generated constructor stub
	}

	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descricion) {
		this.descripcion = descricion;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		stock = stock;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}
	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}
	public void productos(){
		ArrayList<String> lista=new ArrayList<String>();
		lista.add(null);
			
	}
	@Override
	public String toString() {
		return "Producto [categoria=" +categoria +", nombre=" +nombre +", marca=" +marca +", descricion=" +descripcion +", stock=" +stock +",costo= " +costo +","
				+ " precio_venta=" +precio_venta +", fecha_vencimiento= " +fecha_vencimiento +"]";
		
	}

	public void mostrar () {
	System.out.println("Nombre: " +this.nombre);
	System.out.println("Marca: " +this.precio_venta);
	System.out.println("descripcion: " +this.descripcion);
	System.out.println("Stock: " +this.stock);
	}
	public boolean iguales(Producto prod) { //compara prod son iuales o no
		if(this.nombre.equalsIgnoreCase(prod.getNombre())) {
			if (this.marca.equalsIgnoreCase(prod.getMarca())) {
				if (this.descripcion.equalsIgnoreCase(prod.getDescripcion())) {
						return true;	
					}
					else return false;
				}
				else return false;
			}
			else return false;
	
	}
	
	/*conectar conn=new Conectar ();
	String sql="SELET*FROM Producto;";
	ResultSet rs=null;
	PreparedStatement ps=null;
	try {
		ps=conec.getConnection().prepareStatement
	}*/
	public void agregar() {
		
	}
	public void modificar() {
		
	}
	public void eliminar() {
		
	}

	public static Producto insertProducto() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Producto buscarId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getId_Producto() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void eliminar(Object id_Producto) {
		// TODO Auto-generated method stub
		
	}
		
}


