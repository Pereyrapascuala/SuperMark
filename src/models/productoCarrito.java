package models;

public class productoCarrito {
	//atributos
	private int cantidad;
	private float precioVenta;
	
	//contructores
	public productoCarrito(int cantidad, float precioVenta) {
		super();
		this.cantidad = cantidad;
		this.precioVenta = precioVenta;
	}

	public productoCarrito() {
		super();
	}
	//setters and getters

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	//metodos

	@Override
	public String toString() {
		return "productoCarrito [cantidad=" + cantidad + ", precioVenta=" + precioVenta + "]";
	}
	
	
	
	

}
