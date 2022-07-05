package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import conexionBD.creacionTabla;
import conexionBD.properties;
import models.Categorias;


import models.Productos;






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
			servicios.Iproducto productoServicios = new servicios.productoImp(stmt);
			servicios.categoriasImp categoriaServicio = new servicios.categoriasImp(stmt);
			
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
							System.out.print("ingrese el id del producto a buscar :");
							int id = sc.nextInt();
							Productos p = productoServicios.encontrarPorID(id);
							if (p != null) {
								System.out.println(p.toString());
							} else {
								System.out.println("no se encontro ese id");

							}
							break;
						case 3:
							//obetenr la categoria  falla 
							Categorias cate = categoriaServicio.buscarId(1);
							if (cate != null) {
								Productos pNuevo = new Productos(cate, "nuevo", "nuevo", "nuevo", 4, 4, 4);
								productoServicios.save(pNuevo);
							} else {
								System.out.println("no se encontro ese id");

							}
							
							break;
						case 4:
							Productos pEnc = productoServicios.encontrarPorID(2);
							
							if (pEnc !=null) {
								pEnc.setNombre("modificado");
								pEnc.setPrecioVenta(1000);
								productoServicios.update(pEnc);
							} else {
								System.out.println("no se encontro el ID");

							}
							
							

							
							break;
						case 5:
							Productos pEli = productoServicios.encontrarPorID(2);
							if (pEli != null) {
								productoServicios.delete(pEli.getIdProducto());
							} else {
								System.out.println("no se encontro ese id");

							}
							
							
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
 
	
	
	

	


