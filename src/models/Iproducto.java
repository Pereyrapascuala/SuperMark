package models;

import java.util.List;

public interface Iproducto {
	public List<Productos> obtenerProductos();
	public Productos encontrarPorID(int id);
	public void mostrar();
	public void cargarProductos(int idCate, String des, String nom, String mar,int stock, double costo, double precio, String fechaVen  );
	public void save(Productos producto);
	public void update(Productos producto);
	public void delete(int id);
}
