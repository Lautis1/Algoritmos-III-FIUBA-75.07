package modelo;

import java.util.List;

public class BuscadorPorNombre extends Buscador{


	@Override
	public List<Producto> buscarPorNombre(String nombre, ExactitudBusqueda exactitud, int topeResultados) {
		// TODO Auto-generated method stub
		return exactitud.buscarPorNombre(nombre, productos, topeResultados);
		
	}

	@Override
	public List<Producto> buscarPorPrecio(double precioDesde, double precioHasta, int topeResultados) {
		// TODO Auto-generated method stub
		throw new NoSePuedeBuscarPorPrecioError();
	}

	@Override
	public List<Producto> buscarPorCategoria(String nombre, ExactitudBusqueda exactitud, int topeResultados) {
		// TODO Auto-generated method stub
		throw new NoSePuedeBuscarPorCategoriaError();
	}
	


}
