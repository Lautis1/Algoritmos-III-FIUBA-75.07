package Test;


import org.junit.jupiter.api.Test;

import Modelo.Cliente;
import Modelo.Compra;
import Modelo.Libreria;
import Modelo.Libro;
import Modelo.Producto;
import junit.framework.Assert;
public class LibreriaTest {

	@Test
	public void testClienteLautaroNoRegistradoCompraLibroEnJulioDevuelveElPrecioCorrecto() {
				
		Libreria libreria1 = new Libreria();
		libreria1.establecerPrecioProducto("Tu mama", 500);
		
		Cliente lautaro = new Cliente("Lautaro");
		
		Producto libro = new Libro("Tu mama");
		
		Compra compra1 = new Compra();
		
		libreria1.agregarProductoACompraEnMes(compra1, libro, 1, 7);
		
		lautaro.hacerCompra(compra1);
		
		Assert.assertEquals(500.0, libreria1.cobrarMesACliente(lautaro, 7));
	}
	
	@Test
	public void testClienteLautaroRegistradoCompraLibroEnJulioDevuelveElPrecioCorrecto() {
		
		Libreria libreria2 = new Libreria();
		libreria2.establecerPrecioProducto("Tu mama", 500);
		
		Cliente lautaro = new Cliente("Lautaro");
		
		libreria2.registrarClienteEnSistema(lautaro);
		
		Producto libro = new Libro("Tu mama");
		
		Compra compra2 = new Compra();
		
		libreria2.agregarProductoACompraEnMes(compra2, libro, 1, 7);
		
		lautaro.hacerCompra(compra2);
		
		Assert.assertEquals(475.0, libreria2.cobrarMesACliente(lautaro, 7));
	}

	
}
