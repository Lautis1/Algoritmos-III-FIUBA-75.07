package Modelo;

import java.util.ArrayList;

public class Compra {
	private int mesDecompra;
	private double monto = 0;
	private ArrayList<Producto> productos;
	
	public Compra() {
		this.productos = new ArrayList<Producto>();
	}

	public void agregarProducto(Producto producto, double importe, int mes) {
		this.productos.add(producto);
		this.monto += importe * producto.ajustarPrecio(); //iva
		this.mesDecompra = mes;		
	}
	
	public int getMesDeCompra() {
		return this.mesDecompra;
	}
	
	public double pagar() {
		return monto;
	}
}
