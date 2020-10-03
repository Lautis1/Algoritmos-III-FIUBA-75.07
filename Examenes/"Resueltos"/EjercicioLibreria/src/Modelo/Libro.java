package Modelo;

public class Libro extends Producto {
	
	public Libro(String nombre) {
		this.nombre = nombre;
		this.iva = new SinIVA();
	}
}
