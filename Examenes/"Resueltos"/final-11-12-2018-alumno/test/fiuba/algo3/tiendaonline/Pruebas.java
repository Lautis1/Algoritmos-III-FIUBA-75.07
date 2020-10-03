package fiuba.algo3.tiendaonline;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Pruebas {

    private static final double DELTA = 1e-15;

    /*@Test
    public void prueba01() {
        TiendaOnline tienda = new TiendaOnline();

        tienda.setNombre("Lo de Carlos");

        assertEquals("Lo de Carlos", tienda.getNombre());
    }*/

    @Test
    public void CreoPedidoCon1ProductoYEnvioInternacionalDebeDevolverPrecioCon20extra() {
    	
        Map<String, Double> preciosProductos = new HashMap<String, Double>();
        preciosProductos.put("Arduino kit", 2000.00);       

        Map<String, Integer> stockProductos = new HashMap<String, Integer>();       
        stockProductos.put("Arduino kit", 6);        

        TiendaOnline tienda = new TiendaOnline("Mercadolibre");
        tienda.setPreciosProductos(preciosProductos);
        tienda.setStockProductos(stockProductos);
        
        Pedido pedido = new Pedido();
        //tienda.crearNuevoPedido(1);

        tienda.agregarProductoAlPedido(pedido,"Arduino kit", 3);
        tienda.agregarEnvio(pedido, new EnvioInternacional()); // se le aplica un recargo del 20%
        tienda.agregarCuponDeDescuento(pedido, new CuponCyberMonday()); // se le aplica un descuento del 50%

        assertEquals(3600.00, tienda.cobrarPedido(pedido), DELTA);
    }
    @Test
    public void CreoPedidoCon1ProductoYEnvioLocalDebeDevolverPrecioCon10extra() {
    	
    	 Map<String, Double> preciosProductos = new HashMap<String, Double>();
         preciosProductos.put("Arduino kit", 2000.00);  
         preciosProductos.put("Hacha", 150.00);

         Map<String, Integer> stockProductos = new HashMap<String, Integer>();       
         stockProductos.put("Arduino kit", 6);  
         stockProductos.put("Hacha", 4);

         TiendaOnline tienda = new TiendaOnline("Mercadolibre");
         tienda.setPreciosProductos(preciosProductos);
         tienda.setStockProductos(stockProductos);
         
         Pedido pedido = new Pedido();
         tienda.agregarProductoAlPedido(pedido, "Hacha", 2);
         tienda.agregarProductoAlPedido(pedido, "Arduino kit", 2);
         tienda.agregarEnvio(pedido, new EnvioLocal());
         
         assertEquals(4730.00, tienda.cobrarPedido(pedido), DELTA);
    
    }
}
