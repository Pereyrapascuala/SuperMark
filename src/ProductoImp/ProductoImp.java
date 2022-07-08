package ProductoImp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.Producto;
import models.Categoria;

public class ProductoImp implements IProducto{
	private Statement stmt;
	private String sql;
	
	public ProductoImp (Statement stmt) {
		this.stmt=stmt;
	}

	@Override
	public List<Producto> mostrar() {
		List <Producto> lista= new ArrayList<Producto>();
		sql="select producto.*,categoria.id_categoria as idcategoria, categoria.nombre as nombrecategoriab FROM producto INNER JOIN categoria ON producto.id_categoria=categoria.id_categoria";
		try {
			ResultSet rs= stmt.executeQuery(sql);
			while(rs.next()) {
				//crear producto
			Producto prod= new Producto();
			prod.setId_Producto(rs.getInt("id_producto"));
			prod.setNombre(rs.getString("nombre"));
			prod.setMarca(rs.getString("marca"));
			prod.setPrecio_venta(rs.getDouble("precio"));
			//crear una categoria
			Categoria cate=new Categoria();
			cate.setId_categoria(rs.getInt("idcategoria"));
			cate.setNombre(rs.getString("nombrecategoria"));
			//guardar categoria en producto
			prod.setCategoria(cate);
			lista.add(prod);
			}
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("No se pudo realizar la consulta");
		}
		
		return lista;
	}

	/*@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public void alta(Producto producto) {
		sql= "INSERT INTO producto(id_producto,id_categoria,nombre,marca,precio,categoria,descripcion,) VALUES (null,'"+producto.getNombre()+"','"+producto.getMarca()+"',"+producto.getPrecio_venta()+",'"+producto.getCategoria().getId_categoria()+"','"+producto.getDescripcion()+");";
		
		try {
			stmt.executeUpdate(sql);
			System.out.println("Alta exitosa");
		} catch (SQLException e) {
			System.out.println("Error al Cargar Producto");
		}
	}
	
	@Override
	public Producto buscarId(int id) {
		Producto prod = null;
	    sql = "INSERT INTO producto(id_producto,id_categoria,nombre,marca,precio,categoria,descripcion,) VALUES (null,'\"+producto.getNombre()+\"','\"+producto.getMarca()+\"',\"+producto.getPrecio_venta()+\",'\"+producto.getCategoria().getId_categoria()+\"','\"+producto.getDescripcion()+\");\";\r\n"
	    		+ "		 where product.id_producto=" + id;
	    ResultSet rs;
	    try {
	    	rs= stmt.executeQuery(sql);
	    	while (rs.next()) {
				prod = new Producto();
				prod.setId_Producto(rs.getInt("id_Producto"));
				prod.setNombre(rs.getString("nombre"));
				//crear una categoria
				Categoria cate=new Categoria();
				cate.setId_categoria(rs.getInt("idcategoria"));
				cate.setNombre(rs.getString("nombrecategoria"));
				//guardar categoria en producto
				prod.setCategoria(cate);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prod;
	}

	@Override
	public void modificar(Producto producto) {
		sql="UPDATE producto SET nombre='"+producto.getNombre()+"', precio= "+producto.getPrecio_venta()+", costo= "+producto.getCosto()+", categoria= "+producto.getCategoria().getId_categoria()+" where id_producto=" +producto.getId_Producto();
		try {
			stmt.executeUpdate(sql);
			System.out.println("Modificacion exitosa");
		} catch (SQLException e) {
			System.out.println("Error al Modificar Producto");
		}
	}
	@Override
	public void eliminar(int id) {
		sql= "delete from producto where id_producto=" +id;
		try {
			stmt.executeUpdate(sql);
			System.out.println("Producto Eliminado");
		} catch (SQLException e) {
			System.out.println("Error al Eliminar Producto");
		}
	}
	
}