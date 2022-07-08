package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Conexion.Conexion;
import ProductoImp.CategoriaImp;
import ProductoImp.ICategoria;
import ProductoImp.IProducto;
import ProductoImp.ProductoImp;
import models.Categoria;
import models.Producto;

public class app {
    public static  Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		
			int opcion;
		    
			Conexion c=new Conexion();
			

				Connection conn=null;
				Statement stmt=null; 
				
				 try {
						Class.forName(c.JDBC_DRIVER);
						conn = DriverManager.getConnection(c.DB_URL,c.USER,c.PASS);
				    	stmt= conn.createStatement();
				    	String sql;
				    	sql="select*from  producto";
				    	ResultSet rs=stmt.executeQuery(sql);
				    	while (rs.next()) {
				    		int id_producto=rs.getInt("id_producto");
				    		System.out.println(id_producto);
				    		
				    	}	
				    	rs.close();
				    	stmt.close();
				    	conn.close();
					} catch (SQLException se) {
						
						se.printStackTrace();	
					}catch (Exception e) {
						e.printStackTrace();
						
					}finally {
						try {
							if (stmt!=null)
								stmt.close();
							
								
						} catch (SQLException se2) {
						
						}
						try {
							if(conn!=null)
								conn.close();
						} catch (SQLException se2) {
							se2.printStackTrace();
							
						}
					} 
				 // aqui termina el bloque finally.			    
	}



			     IProducto productose=new ProductoImp(stmt);
			       ICategoria categoriase=new CategoriaImp(stmt);
			        String respuesta;
			    
        public void altaProducto() {
				String menuproducto;
				
				switch (menuproducto) {
				case 1:
					System.out.println("Mostrar Producto");
					
					break;
				case 2:
					System.out.println("Alta Producto");
					//Categoria categoriaNueva= Categoria.buscarId(opcion); //cambiar a producto
					//if(categoriaNueva !=null) {
					//crear obj con datos
					Producto producto_nuevo= new Producto();
					productose.alta(null);
					} else
						System.out.println("No se encontro Id de categoria");
					break;
				case 3:
					System.out.println("Modificar Producto");
					Producto prod= Producto.buscarId();
					if(prod!=null){
						prod.setNombre(null);
						prod.setMarca(null);
						prod.setPrecio_venta(opcion);
						prod.setCosto(opcion);
						prod.setDescripcion(null);
					}else
						System.out.println("No se encontro id");
						break;
				case 4:
					System.out.println("Eliminar Producto");
					Producto EliminarProd= Producto.buscarId();
					if(EliminarProd!=null){
						Producto.eliminar(EliminarProd.getId_Producto());
					}else
						System.out.println("No se encontro id");
					break;

				default:
					
					break;
				}
				sc.nextLine();
				System.out.println("desea contirnuar si o no:");
				respuesta = sc.nextLine();
			   }
			   }
	//	public static  int menu() {
					// TODO Auto-generated method stub
		//			return 0;
				
			//	while (respuesta.toUpperCase().equals("SI"));
			//stmt.close();
			//conn.close();
		//	}
		//	private static Categoria Categoria(int opcion) {
				// TODO Auto-generated method stub
		//		return null;
		//	}
		//	private int menuproducto() {
				// TODO Auto-generated method stub
		//		return 0;
		//	}
			public static int menuproducto() {
				String respuesta;
				
				do {
					System.out.println("1. Mostrar Producto");
					System.out.println("2. Alta Producto");
					System.out.println("3. Modificar Producto");
					System.out.println("4. Eliminar Producto");
					System.out.println("Ingrese Una Opcion");
					respuesta=sc.nextLine();
					
					if(respuesta.equalsIgnoreCase("0")==false && respuesta.equalsIgnoreCase("1")==false && respuesta.equalsIgnoreCase("2")==false && respuesta.equalsIgnoreCase("3")==false);
					System.out.println("Ingrese Una Opcion Valida");
					
				}while (respuesta.equalsIgnoreCase("0")==false && respuesta.equalsIgnoreCase("1")==false && respuesta.equalsIgnoreCase("2")==false && respuesta.equalsIgnoreCase("3")==false);
				return Integer.parseUnsignedInt(respuesta);
				
				
			}
			private static Object equalsIgnorecase(String string) {
			
				return null;
			}
			
			}


}
