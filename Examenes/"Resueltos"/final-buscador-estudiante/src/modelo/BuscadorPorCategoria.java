package modelo;

import java.util.List;

public class BuscadorPorCategoria extends Buscador {


	@Override
	public List<Producto> buscarPorNombre(String nombre, ExactitudBusqueda exactitud, int topeResultados) {
		// TODO Auto-generated method stub
		throw new NoSePuedeBuscarPorNombreError();
	}

	@Override
	public List<Producto> buscarPorPrecio(double precioDesde, double precioHasta, int topeResultados) {
		// TODO Auto-generated method stub
		throw new NoSePuedeBuscarPorPrecioError();
	}

	@Override
	public List<Producto> buscarPorCategoria(String categoria, ExactitudBusqueda exactitud, int topeResultados) {
		// TODO Auto-generated method stub
		return exactitud.buscarPorCategoria(categoria, productos, topeResultados);
		
	}
	

}
