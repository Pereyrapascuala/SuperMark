package models;

import java.util.List;

public interface Iproducto {
	public List<Productos> obtenerProductos();
	public Productos encontrarPorID(int id);
	public void mostrar();
	public void cargarProductos(int idCate, String des, String nom, String mar,int stock, double costo, double precio, String fechaVen  );
	
}
