package models;

public class ProductoCarrito {
	private int cantidad;
	private float precio_venta;
	public ProductoCarrito(int cantidad, float precio_venta) {
		super();
		this.cantidad = cantidad;
		this.precio_venta = precio_venta;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(float preccio_venta) {
		this.precio_venta = precio_venta;
	}
	
	public void mostrar () {
		
	}
}
