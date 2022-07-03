package servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import conexionBD.consultasBD;
import conexionBD.properties;

public class verProductos {
	public static void verProduc() {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		System.out.print("desea ver los productos?");
		String reg = sc.nextLine();
		
		if (reg.equals("si")) {
			
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
				
				sql = consultasBD.profindAll();
				ResultSet rs = stmt.executeQuery(sql);
				// extraer datos
				while (rs.next()) {
					int id = rs.getInt("ID");
					String nombre = rs.getString("NOMBRE");
					int precio = rs.getInt("PRECIO");
					
					System.out.print("id: " + id);
					System.out.print(", nombre:" + nombre);
					System.out.print(", precio:" + precio);
					
					System.out.println();
					
				}
				
				System.out.println("se ha generado su usuario , usted completo el proceso de registro");
									
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
