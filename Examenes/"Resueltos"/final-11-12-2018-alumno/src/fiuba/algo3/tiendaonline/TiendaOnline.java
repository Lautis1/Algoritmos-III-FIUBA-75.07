package fiuba.algo3.tiendaonline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TiendaOnline {

    private String nombre;
    private Map<String, Double> preciosProductos = new HashMap<String, Double>();
    private Map<String, Integer> stockProductos = new HashMap<String, Integer>();
    
    public TiendaOnline(String nombre) {
    	this.nombre = nombre;
    }

    /*public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private List<String> pedidos = new ArrayList<String>();
    private double precioDelPedido = 0;*/

    public Map<String, Double> getPreciosProductos() {
        return preciosProductos;
    }

    public void setPreciosProductos(Map<String, Double> preciosProductos) {
        this.preciosProductos = preciosProductos;
    }

    public Map<String, Integer> getStockProductos() {
        return stockProductos;
    }

    public void setStockProductos(Map<String, Integer> stockProductos) {
        this.stockProductos = stockProductos;
    }

    /*public void crearNuevoPedido(int id) {
        Pedido pedido = new Pedido(id);
        pedidos.add(pedido);
    }*/

    public void agregarProductoAlPedido(Pedido pedido, String nombreDelProducto, int cantidad) {
        double importe = cantidad * (preciosProductos.get(nombreDelProducto));
        pedido.agregarProducto(nombreDelProducto, importe);
        int stock = stockProductos.get(nombreDelProducto);
        stock -= this.stockProductos.get(nombreDelProducto); // decremento el stock
        this.stockProductos.put(nombreDelProducto, stock); // actualizo el stock
        //pedidos.add(nombreDelProducto);
        //System.out.println("Se ha agregado un producto al pedido.");
    }

    public void agregarCuponDeDescuento(Pedido pedido, Cupon cupon) {
    	pedido.agregarCupon(cupon);
    }
        /*if (cupon == Cupon.BLACK_FRIDAY_85) {
            precioDelPedido *= 0.15; // se aplica descuento del 85%
        } else if (cupon == Cupon.CYBER_MONDAY_50) {
            precioDelPedido *= 0.5;  // se aplica descuento del 50%
        } else if (cupon == Cupon.MERRY_CHRISTMAS_25) {
            precioDelPedido *= 0.75; // se aplica descuento del 25%
        } else {
            System.out.println("ERROR: Cupon invalido!");
        }
        System.out.println("Se ha agregado un descuento al pedido.");
    }*/

    public void agregarEnvio(Pedido pedido, Envio envio) {
        /*try {
            EnvioLocal elEnvio = (EnvioLocal) envio;
            precioDelPedido *= elEnvio.getRecargo(); // se agrega un 10% de recargo para un envio local
        } catch(ClassCastException e1) {
            try {
                EnvioInternacional elEnvio = (EnvioInternacional) envio;
                precioDelPedido *= elEnvio.getRecargo(); // se agrega un 20% de recargo para un envio internacional
            } catch(ClassCastException e2) {
                System.out.println("ERROR: Tipo de envio invalido!");
            }
        }
        System.out.println("Se ha agregado un envio al pedido");*/
    	pedido.agregarEnvio(envio);
    }

    public double cobrarPedido(Pedido pedido) {
		return pedido.serCobrado();
    }
}
