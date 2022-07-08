package ProductoImp;

import java.util.List;

import models.Producto;

public interface IProducto {
	public List<Producto> mostrar();
	//public void mostrar();
	public void alta(Producto producto);
	public void modificar(Producto producto);
	public void eliminar(int id);
	Producto buscarId(int id);

}
