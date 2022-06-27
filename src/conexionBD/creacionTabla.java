package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class creacionTabla {
	public static void crearTabla() {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		
		
		System.out.print("desea crear las tablas?");
		String reg = sc.nextLine();
		
		
		
		if (reg.equals("si")) {
			System.out.println("lo llevaremos al proceso de creacion de tablas");
			try {
				//registrar el driver
				Class.forName(properties.JDBC_DRIVER);
				//abrir conexion
				System.out.println("conectando");
				conn = DriverManager.getConnection(properties.DB_URL,properties.USER,properties.PASS);
				//ejecutar consulta sql
				System.out.println("creando statemen...");
				stmt = conn.createStatement();
				String sql;
				sql= consultasBD.crearTablaUsuario();
				stmt.executeUpdate(sql);
				
				sql = consultasBD.crearTabCliente();
				stmt.executeUpdate(sql);
				
				sql = consultasBD.crearTabProducto();
				stmt.executeUpdate(sql);
				
				sql = consultasBD.crearTabCategorias();
				stmt.executeUpdate(sql);  
				
				sql = consultasBD.crearTabVentas();
				stmt.executeUpdate(sql);
				
				sql = consultasBD.crearTabDetalleVentas();
				stmt.executeUpdate(sql);
				
				System.out.println("se han generado generado las tabla");
									
				stmt.close();
				conn.close();
			   
			}catch (Exception e) {
				System.out.println("algun erro al conectar");
			}
			
			
			
		} else {
			System.out.println("hasta pronto");
			

		}
		
	}
	
	
	
}

