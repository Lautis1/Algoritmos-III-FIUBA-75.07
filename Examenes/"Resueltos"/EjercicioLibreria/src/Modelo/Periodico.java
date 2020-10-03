package Modelo;

public class Periodico extends Producto{
	private int periodicidad;
	
	public Periodico(String nombre) {
		this.nombre = nombre;
		this.iva = new SinIVA();
	}
}
