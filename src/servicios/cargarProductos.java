package servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import conexionBD.consultasBD;
import conexionBD.properties;

public class cargarProductos {
	public static void cargarPro(){
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		System.out.print("desea cargar productos?");
		String reg = sc.nextLine();
		
		if (reg.equals("si")) {
			System.out.println("lo llevaremos al proceso para cargar productos");
			try {
				//registrar el driver
				Class.forName(properties.JDBC_DRIVER);
				//abrir conexion
				System.out.println("conectando");
				conn = DriverManager.getConnection(properties.DB_URL,properties.USER,properties.PASS);
				//ejecutar consulta sql
				System.out.println("a la base de datos");
				stmt = conn.createStatement();
				String sql;
				
				System.out.println();
				System.out.print("ingrese su nombre del producto:");
				String nom = sc.nextLine();
				System.out.print("ingrese la descripcion del producto:");
				String des = sc.nextLine();
				System.out.print("ingrese la marca del producto:");
				String mar = sc.nextLine();
				System.out.print("ingrese la categoria del producto:");
				String cat = sc.nextLine();
				System.out.print("ingrese el precio del producto:");
				float pre = sc.nextFloat();
				System.out.print("ingrese la cantidad del producto:");
				int can = sc.nextInt();
				
				
				System.out.println("");
				
				sql= consultasBD.insert(nom, des, mar, cat, can, pre);
				stmt.executeUpdate(sql);
				
				
				System.out.println("su producto se ah cargado satisfactoriamente");
									
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
