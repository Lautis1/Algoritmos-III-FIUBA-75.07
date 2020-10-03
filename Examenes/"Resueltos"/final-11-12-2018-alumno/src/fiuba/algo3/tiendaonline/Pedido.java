package fiuba.algo3.tiendaonline;

import java.util.ArrayList;

public class Pedido {
	protected double precioPedido = 0;
	protected ArrayList<String> productos;
	
	
	public Pedido() {
		
		this.productos = new ArrayList<>();
	}

	public void agregarProducto(String nombreDelProducto, double importe) {
		this.productos.add(nombreDelProducto);
		this.precioPedido += importe;
		
	}

	public void agregarCupon(Cupon cupon) {
		this.precioPedido *= cupon.obtenerDescuento();
		
	}
	
	
	public double serCobrado() {
		double copiaPrecio = this.precioPedido;
		this.precioPedido = 0;
		productos.clear();
		return copiaPrecio;
	}

	public void agregarEnvio(Envio envio) {
		this.precioPedido = envio.aplicarRecargo(this.precioPedido);
		
	}
}	