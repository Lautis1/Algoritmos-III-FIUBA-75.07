package modelo;

import java.util.List;

public abstract class ExactitudBusqueda {
	
	public abstract List<Producto> buscarPorNombre(String nombre, List<Producto> productos, int topeResultados);
	public abstract List<Producto> buscarPorCategoria(String categoria, List<Producto> productos, int topeResultados);
}