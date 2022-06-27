package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import conexionBD.consultasBD;
import conexionBD.properties;

public class Registro {
	
	
	
	public static void registrarme() {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		
		
		System.out.print("desea registrarse?");
		String reg = sc.nextLine();
		
		
		
		if (reg.equals("si")) {
			System.out.println("lo llevaremos al proceso de registro");
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
				
				System.out.println();
				System.out.print("ingrese su nombre:");
				String nom = sc.nextLine();
				System.out.print("ingrese su apellido:");
				String ape = sc.nextLine();
				System.out.print("ingrese su domicilio:");
				String dom = sc.nextLine();
				System.out.print("ingrese su telefono:");
				String tel = sc.nextLine();
				System.out.print("ingrese su email:");
				String ema = sc.nextLine();
				System.out.print("genere su clave de usuario:");
				String contra = sc.nextLine();
				System.out.print("ingrese su dni:");
				int dni = sc.nextInt();
				System.out.println("");
				
				sql= consultasBD.insert( nom, ape, dom, tel, ema, dni);
				stmt.executeUpdate(sql);
				
				
				
				sql= consultasBD.insert(ema, contra);
				stmt.executeUpdate(sql);
				
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
