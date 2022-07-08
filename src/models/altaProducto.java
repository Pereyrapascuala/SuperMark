package models;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class altaProducto extends Producto {
	
    private static final Consumer<? super Producto> Producto = null;

	public boolean alta() {
    	//Scanner sc=new Scanner(System.in);
    	
    	ArrayList<Producto> listaProducto= new ArrayList<Producto>();
    	Producto nuevoProducto=new Producto(getId_Producto(), getCategoria(), getNombre(), getMarca(), getDescripcion(), getStock(), getCosto(), getPrecio_venta(), getFecha_vencimiento(), isDisponible());
    	
    	listaProducto.add(nuevoProducto);
    	
    	System.out.println("formulario de registro de productos");
    	//for (int i=0; i<lista.size(); i++) {
    	for (Producto produ : listaProducto) {
    		System.out.println(produ.getId_Producto());
		
    	}
    	return false;
    }
	//cosultar base de datos
	/*StockProducto nuevoproductoStock= new StockProducto ();
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL= "jdbc:mysql://localhost:3305/SuperMark";",
	
	if (conectar.conn()) {
		
	}
	else 
		System.aot.println("error de conexion");
}*/
}

