package modelo;

import java.util.ArrayList;
import java.util.List;

public class BuscadorPorPrecio extends Buscador {


	@Override
	public List<Producto> buscarPorNombre(String nombre, ExactitudBusqueda exactitud, int topeResultados) {
		// TODO Auto-generated method stub
		throw new NoSePuedeBuscarPorNombreError();
	}

	@Override
	public List<Producto> buscarPorPrecio(double precioDesde, double precioHasta, int topeResultados) {
		// TODO Auto-generated method stub
		List<Producto> resultados = new ArrayList<Producto>();
		int iteraciones = 0;
        for (Producto producto: productos) {
        	iteraciones += 1;
            if (producto.getPrecio() >= precioDesde && producto.getPrecio() <= precioHasta) {
                resultados.add(producto);
            }
            if (iteraciones > topeResultados) break;
        }
		return resultados;
	}

	@Override
	public List<Producto> buscarPorCategoria(String nombre, ExactitudBusqueda exactitud, int topeResultados) {
		// TODO Auto-generated method stub
		throw new NoSePuedeBuscarPorCategoriaError();
	}


}
