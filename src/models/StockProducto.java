package models;
import java.sql.Date;

public class StockProducto extends Producto{
       private int stock;
       private double costo;
       private double precio_venta;
       
	
	public StockProducto(int id_Producto, Categoria categoria, String nombre, String marca, String descripcion,
			int stock, double costo, double precio_venta, Date fecha_vencimiento, boolean disponible, int stock2,
			double costo2, double precio_venta2) {
		super(id_Producto, categoria, nombre, marca, descripcion, stock, costo, precio_venta, fecha_vencimiento,
				disponible);
		stock = stock2;
		costo = costo2;
		precio_venta = precio_venta2;
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
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
    
	public void mostrar() {
		super.mostrar();
		System.out.println("Stock:" +this.stock);
		System.out.println("Costo:" +this.costo);
		System.out.println("Precio de venta: " +this.precio_venta);
	}
	public String crearQueryInsert() {
		return "insert into Producto (fecha,nombre,marca,precio_venta,descripcion,stock,) values (now(),'"+super.getNombre()+"','"+super.getMarca()+"','"+super.getPrecio_venta()+",'"+super.getCategoria()+"','"+super.getDescripcion()+"','"+this.stock+");";
		
	}
       
}
