package Conexion;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.x.protobuf.MysqlxExpect.Open.Condition.Key;

public class Conexion {
	public String JDBC_DRIVER;
	public String DB_URL;
	//credenciales de BD
	public String USER;
	public String PASS;
	private Connection conn;
    private Statement stmt;
    private ResultSet rs;
	private String properties;
    
	public Conexion() {
		super();
		/*JDBC_DRIVER = jDBC_DRIVER;
		DB_URL = dB_URL;
		USER = uSER;
		PASS = pASS;*/
		this.JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		 this.DB_URL = "jdbc:mysql://localhost:3305/SuperMark";
		 this.USER = "root";
		 this.PASS = "root";
		 this.properties = "C:\\Users\\PAKY\\eclipse-workspace/SuperMark";
		
		/*this.conn=null;
		this.stmt=null;
		this.rs=null;*/
	}

	public String getJDBC_DRIVER() {
		return JDBC_DRIVER;
	}
	public void setJDBC_DRIVER(String jDBC_DRIVER) {
		JDBC_DRIVER = jDBC_DRIVER;
	}
	public String getDB_URL() {
		return DB_URL;
	}
	public void setDB_URL(String dB_URL) {
		DB_URL = dB_URL;
	}
	public String getUSER() {
		return USER;
	}
	public void setUSER(String uSER) {
		USER = uSER;
	}
	public String getPASS() {
		return PASS;
	}
	public void setPASS(String pASS) {
		PASS = pASS;
	}
	public Connection getConn() {
		return conn;
	}
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	public Statement getStmt() {
		return stmt;
	}
	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}
	public ResultSet getRs() {
		return rs;
	}
	public void setRs(ResultSet rs) {
		this.rs = rs;
	}
	

	/*public boolean conectar() {
		 boolean respuesta=true;
		 try {
			Class.forName(this.JDBC_DRIVER);
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();	
		}
	    try {
	    	conn = DriverManager.getConnection(DB_URL,USER,PASS);
	    	stmt=(Statement) conn.createStatement();
	    }catch (SQLException e) {
	    	respuesta=false;
	    }
	    return respuesta;
	    }
 
     public String select (String query) {
    	 String string="";
    	 try {
			this.rs= this.stmt.executeQuery(query);
			ResultSetMetaData rsmd=(ResultSetMetaData) this.rs.getMetaData();
			for (int i=1; i<rsmd.getColumnCount(); i++) {
				while(rs.next()) {
					switch (rsmd.getColumnType(i)) {
					case 1:
						//un caso para cada tipo de atributo
						//12 string  4 int 93 date
						break;

					default:
						System.out.println("Tipo:" +rsmd.getColumnType(i));
					}
					if(i>rsmd.getColumnCount()) {
						string=string+",";
					}
				}
				string=string+",";
				}
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return string;
     }	*/	
}