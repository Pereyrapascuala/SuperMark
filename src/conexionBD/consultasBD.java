package conexionBD;

public class consultasBD {
	
	public static String update(int id, String nombre, int precio, int idcat) {
		return "UPDATE productos SET NOMBRE = '"+ nombre+"', PRECIO ="+precio+", ID_CATE =" +idcat+ " WHERE ID ="+id;
	}
	public static String delete(int id) {
		return "delete from productos where id_prod= "+ id;
	}
	public static String profindAll() {
		return "SELECT * from producto";
	}
	public static String insert(String nom, String ape, String dom, String tel, String ema, int dni) {
		return "INSERT INTO cliente (ID, NOMBRE, APELLIDO, DOMICILIO, TELEFONO, EMAIL, DNI) VALUES (  NULL  ,'" + nom + "','" +ape +"','" + dom+"','" + tel + "','" + ema + "'," + dni + ");";
	}
	public static String get(int id) {
		return "SELECT * from productos where ID = " + id;
	}
	public static String insert(String email, String contra) {
		return "INSERT INTO usuario (EMAIL, CLAVE) VALUES ('"+email+"', '"+contra+"');";
	}
	public static String insert(String nom, String des, String mar, String cat, int can, float pre) {
		return "INSERT INTO producto (ID, NOMBRE, DESCRIPCION, MARCA, CATEGORIA, CANTIDAD, PRECIO) VALUES (NULL, '" + nom + "','" +des +"','" + mar+"','" + cat + "'," + can + "," + pre + ");";
	}
	public static String crearTablaUsuario() {
		return "CREATE TABLE usuarios (\r\n"
				+ " email VARCHAR(30) NOT NULL ,\r\n"
				+ " idCliente INT(4) NOT NULL ,\r\n"
				+ " clave VARCHAR(8) NULL ,\r\n"
				+ " tipoUsuario VARCHAR(1)NULL ,\r\n"
				+ "PRIMARY KEY (email(30))\r\n"
				+ ");";
	}				
	public static String crearTabCliente() {
		return "CREATE TABLE clientes (\r\n"
				+ " idCliente INT(4) NOT NULL AUTO_INCREMENT ,\r\n"
				+ " nombre VARCHAR(20) NULL ,\r\n"
				+ " apellido VARCHAR(20) NULL ,\r\n"
				+ " direccion VARCHAR(45) NULL ,\r\n"
				+ " telefono VARCHAR(15) NULL ,\r\n"
				+ " dni INT(10) NULL ,\r\n"
				+ " PRIMARY KEY (idCliente(4))\r\n"
				+ ");";
	}
	public static String crearTabProducto() {
		return "CREATE TABLE productos (\r\n"
				+ " idProducto INT(4) NOT NULL AUTO_INCREMENT ,\r\n"
				+ " idCategoria INT(4) NOT NULL ,\r\n" 
				+ " descripcion VARCHAR(100) NULL ,\r\n" 
				+ " nombre VARCHAR(25) NULL ,\r\n"
				+ " marca VARCHAR(25) NULL ,\r\n"
				+ " stock INT(10) NULL ,\r\n"
				+ " costo FLOAT(10) NULL ,\r\n"
				+ " precioVenta FLOAT(10) NULL ,\r\n"
				+ " fechaVencimiento DATE NULL ,\r\n"
				+ " PRIMARY KEY (idProducto(4)) \r\n"
				+ ");";
	}
	public static String crearTabCategorias() {
		return "CREATE TABLE categorias (\r\n"
				+ "idCategoria INT(4) NOT NULL ,\r\n" 
				+ "nombre VARCHAR(25) NULL ,\r\n" 
				+ "PRIMARY KEY (idCategoria(4))\r\n"
				+ ");";
	}
	public static String crearTabVentas() {
		return "CREATE TABLE ventas (\r\n"
				+ "idVentas INT(4) NOT NULL AUTO_INCREMENT , \r\n"
				+ "fecha DATE NULL ,\r\n"
				+ "idClienteVentas INT(4) NULL ,\r\n"
				+ "PRIMARY KEY (idVentas(4)) \r\n"
				+ ")";
	}
	public static String crearTabDetalleVentas() {
		return "CREATE TABLE detalleVentas (\r\n"
				+ "idProducto INT(4) NOT NULL , \r\n"
				+ "idVentas INT(4) NOT NULL , \r\n"
				+ "cantidad INT(10) NULL \r\n"
				+ ");";
	}

}
