package Controlador;

import java.sql.Date;
import java.util.Scanner;

import models.Categoria;
import models.Producto;

public class test {
	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		int MenuProducto=0;
		switch (MenuProducto) {
		case 1:
			System.out.println("Mostrar Producto");
			
			break;
		case 2:
			System.out.println("Alta Producto");
			Producto prod= Producto.insertProducto();
			/*}
			
	}	*/	
			
			
			System.out.println("No se cargo el producto");
			break;
			case 3:
				System.out.println("Modificar Producto");
				Producto produ= Producto.buscarId();
				if(produ!=null){
					produ.setNombre(null);
					produ.setMarca(null);
					double opcion = 0;
					produ.setPrecio_venta(opcion);
					produ.setCosto(opcion);
					produ.setDescripcion(null);
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
				//sc.nextLine();
				//System.out.println("desea contirnuar si o no:");
			//	MenuProducto = sc.nextInt();

		default:
			break;
		}		
}
	public Producto insertarProduc() {
		String nombre;
		String marca;
		String descripcion;
		int idcategoria;
		int stock;
		double costo;
		double precio_venta;
		String fecha_vencimiento;
		System.out.println("ingrese nombre" );
		nombre=sc.nextLine();
		System.out.println("ingrese marca" );
		marca=sc.nextLine();
		System.out.println("ingrese descripcion" );
		descripcion=sc.nextLine();
		System.out.println("idcategoria");
		idcategoria=sc.nextInt();
		System.out.println("ingrese Stock" );
		stock=sc.nextInt();
		System.out.println("ingrese costo" );
		costo=sc.nextDouble();
		System.out.println("ingrese precio_venta" );
		precio_venta=sc.nextDouble();
		System.out.println("ingrese fecha_vencimiento");
		fecha_vencimiento=sc.nextLine();
		Date date= Date.valueOf(fecha_vencimiento);
		
		
		Producto producto= new Producto (nombre, marca, descripcion, idcategoria, stock, costo, precio_venta,  date);
		return producto;
		
	}
}
	


