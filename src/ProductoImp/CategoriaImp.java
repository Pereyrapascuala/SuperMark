package ProductoImp;

import java.sql.ResultSet;
import java.sql.Statement;

import models.Categoria;

public class CategoriaImp implements ICategoria  {
	private Statement stmt;
	private String sql;
	
	public CategoriaImp (Statement stmt) {
		this.stmt=stmt;
	}
	@Override
	public Categoria buscarId(int id) {
		Categoria c = null;
	    sql = "SELECT * from categoria where idCategoria=" + id;
	    ResultSet rs;
	    try {
	    	rs= stmt.executeQuery(sql);
	    	while (rs.next()) {
				c = new Categoria();
				c.setId_categoria(rs.getInt("idCategoria"));
				c.setNombre(rs.getString("nombre"));
				
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

}
