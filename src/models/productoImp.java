package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class productoImp implements Iproducto{
	private Statement stmt;
	private String sql;
	
	public productoImp(Statement stmt) {
		
		this.stmt = stmt;
	}

	@Override
	public List<Productos> obtenerProductos() {
		List<Productos> lista = new ArrayList<Productos>();
		sql = "SELECT productos.*, categorias.idCategoria as idCate, categorias.nombre as nombreCategoria\r\n"
				+ "FROM productos\r\n"
				+ "INNER JOIN categorias ON\r\n"
				+ "productos.idCategoria=categorias.idCategoria";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Productos p = new Productos();
				p.setIdProducto(rs.getInt("idProducto"));
				p.setNombre(rs.getString("nombre"));
				p.setPrecioVenta(rs.getDouble("precioVenta"));
				//crear una categoria
				Categorias c = new Categorias();
				c.setIdCategoria(rs.getInt("idCate"));
				c.setNombre(rs.getString("nombreCategoria"));
				//guardo la categoria en producto
				p.setIdCategoria(c);
				lista.add(p);	
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("no se pudo realizar consulta");
		}
		
				
		return lista;
	}

	@Override
	public Productos encontrarPorID(int id) {
		Productos p=null;
		sql = "SELECT productos.*, categorias.idCategoria as idCate, categorias.nombre as nombreCategoria\r\n"
				+ "FROM productos\r\n"
				+ "INNER JOIN categorias ON\r\n"
				+ "productos.idCategoria=categorias.idCategoria\r\n"
				+ "WHERE productos.idProducto= "+ id;
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				p = new Productos();// instancio el producto
				p.setIdProducto(rs.getInt("idProducto"));
				p.setNombre(rs.getString("nombre"));
				p.setPrecioVenta(rs.getDouble("precioVenta"));
				//crear una categoria
				Categorias c = new Categorias();
				c.setIdCategoria(rs.getInt("idCate"));
				c.setNombre(rs.getString("nombreCategoria"));
				//guardo la categoria en producto
				p.setIdCategoria(c);
				
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("no se pudo realizar consulta");
		}
		
				
		return p;
	}

	@Override
	public void mostrar() {
		
		sql = "SELECT productos.*, categorias.idCategoria as idCate, categorias.nombre as nombreCategoria\r\n"
				+ "FROM productos\r\n"
				+ "INNER JOIN categorias ON\r\n"
				+ "productos.idCategoria=categorias.idCategoria";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Productos p = new Productos();
				p.setIdProducto(rs.getInt("idProducto"));
				p.setNombre(rs.getString("nombre"));
				p.setPrecioVenta(rs.getDouble("precioVenta"));
				//crear una categoria
				Categorias c = new Categorias();
				c.setIdCategoria(rs.getInt("idCate"));
				c.setNombre(rs.getString("nombreCategoria"));
				//guardo la categoria en producto
				p.setIdCategoria(c);
				System.out.println(p.toString());//imprimo los datos
				
					
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("no se pudo realizar consulta");
		}
		
				
		
		
		
	}

	

	@Override
	public void cargarProductos(int idCate, String des, String nom, String mar, int stock, double costo, double precio,
			String fechaVen) {
		sql = "INSERT INTO productos (idProducto, idCategoria, descripcion, nombre, marca, stock, costo, precioVenta, fechaVencimient) VALUES (NULL," + idCate + ",  '" + des + "','" +nom +"','" + mar+"'," + stock + "," + costo + "," + precio + ");";
		
		
		
	}
    
}
