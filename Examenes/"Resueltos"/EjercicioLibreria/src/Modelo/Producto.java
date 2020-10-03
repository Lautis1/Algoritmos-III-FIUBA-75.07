package Modelo;

public abstract class Producto {
	public String nombre;
	protected EstadoIVA iva;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double ajustarPrecio() {
		return iva.aplicar();
	}
}
