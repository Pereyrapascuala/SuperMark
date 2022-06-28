package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import conexionBD.creacionTabla;
import conexionBD.properties;
import models.Categorias;
import models.ICategoria;
import models.Iproducto;
import models.Productos;
import models.Registro;
import models.cargarProductos;
import models.categoriasImp;
import models.productoImp;
import models.verProductos;

public class main {
	public static int opcion;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
		Connection conn = null;
		Statement stmt = null;
		try {
			//registrar el driver
			Class.forName(properties.JDBC_DRIVER);
			//abrir conexion
			System.out.println("conectando");
			conn = DriverManager.getConnection(properties.DB_URL,properties.USER,properties.PASS);
			//ejecutar consulta sql
			//System.out.println("creando statemen...");
			stmt = conn.createStatement();
			String sql;
			//
			//System.out.println("****definimos nuestros servicios***");
			Iproducto productoServicios = new productoImp(stmt);
			ICategoria categoriaServicio = new categoriasImp(stmt);
			
			System.out.println("*******************************");
			
			
			String respuesta;
			do {
				menuPrincipal();
				switch (opcion) {
				case 1:
					menuAdministracion();
					switch (opcion) {
					case 1:
						menuUsuarios();
						break;
					case 2:
						menuProductos();
						switch (opcion) {
						case 1:
							productoServicios.mostrar();
							break;
						case 2 :
							Productos p = productoServicios.encontrarPorID(1);
							if (p != null) {
								System.out.println(p.toString());
							} else {
								System.out.println("no se encontro ese id");

							}
							break;
						case 3:
							//obetenr la categoria
							Categorias cate = categoriaServicio.buscarId(1);
							if (cate != null) {
								Productos pNuevo = new Productos(cate, "nuevo", "nuevo producto", "adidas", 100, 15999, 20000, 1233-06-03);
								productoServicios.save(pNuevo);
							} else {
								System.out.println("no se encontro ese id");

							}
							
							//
							
							
							break;
						case 4:
							break;
						case 5:
							break;
						   

						default:
							break;
						}
						
						break;

					default:
						break;
					}
					break;
				case 2:
					menuClientes();
					switch (opcion) {
					case 1:
						
						break;
					case 2:
						break;

					default:
						
						break;
					}

				default:
					break;
				}
				
				
				sc.nextLine();
				System.out.println("desea contirnuar si o no:");
				respuesta = sc.nextLine();
			} while (respuesta.toUpperCase().equals("SI"));
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("algun error al conectar");
		}
		System.out.println("****termino****");

	/*creacionTabla.crearTabla();
		Registro.registrarme();
		cargarProductos.cargarPro();*/
		
	}
	public static void menuPrincipal() {
		System.out.println("*********menu principal********");
		System.out.println("*******************************");
		System.out.println("***usted quiere ingresar como:");
		System.out.println("*****1- Administracion ");
		System.out.println("*****2- Cliente  ");
		System.out.print("***ingrese una opcion del menu principal:");
		opcion = sc.nextInt();
	}
	public static void menuAdministracion()  {
		System.out.println("********Administracion******");
		System.out.println("*****1- clientes ");
		System.out.println("*****2- productos");
		System.out.print("****ingrese una opcion:");
		opcion = sc.nextInt();				
	}
	public static void menuProductos() {
		System.out.println("******productos*****");
		System.out.println("*****1- mostrar todos");
		System.out.println("*****2- obtener x id");
		System.out.println("*****3- alta");
		System.out.println("*****4- modificar ");
		System.out.println("*****5- eliminar");
		System.out.print("*****Ingrese un opcion:");
		opcion = sc.nextInt();
				
	}
	public static void menuUsuarios() {
		System.out.println("******clientes*****");
		System.out.println("*****1- mostrar todos");
		System.out.println("*****2- obtener x id");
		System.out.println("*****3- alta");
		System.out.println("*****4- modificar ");
		System.out.println("*****5- eliminar");
		System.out.print("*****Ingrese una opcion:");
		opcion = sc.nextInt();
		
	}
	public static void menuClientes() {
		System.out.println("******clientes*****");
		System.out.println("*****1- registrarse");
		System.out.println("*****2- iniciar sesion");
		System.out.print("*****Ingrese una opcion:");
		opcion = sc.nextInt();
	}
	
 
		
	}
 
	
	
	

	


