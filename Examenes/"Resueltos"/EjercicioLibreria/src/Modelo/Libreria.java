package Modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
;

public class Libreria {
	
	private Map<String, Double> preciosProductos = new HashMap<String, Double>();
	
	
	public void registrarClienteEnSistema(Cliente cliente) {
		cliente.registrarEnSistema();
	}
	
	public void agregarProductoACompraEnMes(Compra compra, Producto producto, int cantidad, int mes) {
        double importe = cantidad * (preciosProductos.get(producto.getNombre()));
        compra.agregarProducto(producto, importe, mes);        
	}
	
	public double cobrarMesACliente(Cliente cliente, int mes) {
		return cliente.pagarMes(mes);
	}
	
	public void establecerPrecioProducto(String nombre, double precio) {
		preciosProductos.put(nombre, precio);
	}
}
