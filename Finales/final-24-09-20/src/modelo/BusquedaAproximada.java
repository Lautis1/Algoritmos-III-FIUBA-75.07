package modelo;

import java.util.ArrayList;
import java.util.List;

public class BusquedaAproximada extends ExactitudBusqueda {

	@Override
	public List<Producto> buscarPorNombre(String nombre, List<Producto> productos, int topeResultados) {
		
		List<Producto> resultados = new ArrayList<Producto>();
		int iteraciones = 0;
        for (Producto producto: productos) {
        	iteraciones += 1;
            if (producto.getNombre().startsWith(nombre)) {
                resultados.add(producto);
            }
            if(iteraciones>topeResultados) break;
        }
        return resultados;
	}

	@Override
	public List<Producto> buscarPorCategoria(String categoria, List<Producto> productos, int topeResultados) {
		// TODO Auto-generated method stub
		List<Producto> resultados = new ArrayList<Producto>();
		int iteraciones = 0;
        for (Producto producto: productos) {
        	iteraciones += 1;
            if (producto.getCategoria().contains(categoria)) {
                resultados.add(producto);
            }
            if(iteraciones>topeResultados) break;
        }
        return resultados;
	}
	
	

}
