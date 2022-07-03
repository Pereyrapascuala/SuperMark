package servicios;

import java.sql.ResultSet;
import java.sql.Statement;

import models.Categorias;

public class categoriasImp implements ICategoria {
	private String sql;
	private Statement stmt = null;
	
	

	public categoriasImp(Statement stmt) {
		super();
		this.stmt = stmt;
	}



	@Override
	public Categorias buscarId(int id) {
		Categorias c = null;
	    sql = "SELECT * from categorias where idCategoria=" + id;
	    ResultSet rs;
	    try {
	    	rs= stmt.executeQuery(sql);
	    	while (rs.next()) {
				c = new Categorias();
				c.setIdCategoria(rs.getInt("idCategoria"));
				c.setNombre(rs.getString("nombre"));
				
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

}
