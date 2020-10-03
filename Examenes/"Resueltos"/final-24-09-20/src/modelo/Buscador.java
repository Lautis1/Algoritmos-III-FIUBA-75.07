package modelo;

import java.util.ArrayList;
import java.util.List;

public  abstract class Buscador {
	protected List<Producto> productos;
	
	
	
	public Buscador() {
        productos = new ArrayList<Producto>();
    }
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public abstract List<Producto> buscarPorNombre(String nombre, ExactitudBusqueda exactitud,int topeResultados);
	public abstract List<Producto> buscarPorPrecio(double precioDesde, double precioHasta, int topeResultados);
	public abstract List<Producto> buscarPorCategoria(String categoria, ExactitudBusqueda exactitud, int topeResultados);
	
	
}
