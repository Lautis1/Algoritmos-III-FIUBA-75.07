package Modelo;

public class Revista extends Producto {
	private int periodicidad;
	
	public Revista(String nombre) {
		this.nombre = nombre;
		this.iva = new SinIVA();
	}
}
